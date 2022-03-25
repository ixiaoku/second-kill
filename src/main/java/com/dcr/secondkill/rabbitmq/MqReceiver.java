package com.dcr.secondkill.rabbitmq;

import com.dcr.secondkill.entity.TSeckillOrder;
import com.dcr.secondkill.entity.TUser;
import com.dcr.secondkill.service.ITGoodsService;
import com.dcr.secondkill.service.ITOrderService;
import com.dcr.secondkill.utils.JsonUtil;
import com.dcr.secondkill.vo.GoodsVo;
import com.dcr.secondkill.vo.SeckillMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 消息消费者
 *
 * @author: LC
 * @date 2022/3/7 7:44 下午
 * @ClassName: MqReceiver
 */
@Service
@Slf4j
public class MqReceiver {

    @Autowired
    private ITGoodsService itGoodsService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private ITOrderService itOrderService;

    /**
     * 下单操作
     * @param message
     */
    @RabbitListener(queues = "seckillQueue")
    public void receive(String message) {
        log.info("接收消息：" + message);
        SeckillMessage seckillMessage = JsonUtil.jsonStr2Object(message, SeckillMessage.class);
        Long goodsId = seckillMessage.getGoodsId();
        TUser user = seckillMessage.getTUser();
        GoodsVo goodsVo = itGoodsService.findGoodsVobyGoodsId(goodsId);
        if (goodsVo.getStockCount() < 1) {
            return;
        }
        //判断是否重复抢购
        TSeckillOrder tSeckillOrder = (TSeckillOrder) redisTemplate.opsForValue().get("order:" + user.getId() + ":" + goodsId);
        if (tSeckillOrder != null) {
            return;
        }
        //下单操作
        itOrderService.secKill(user, goodsVo);
    }
}
