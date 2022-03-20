package com.dcr.secondkill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dcr.secondkill.vo.OrderDeatilVo;
import com.dcr.secondkill.entity.TOrder;
import com.dcr.secondkill.entity.TUser;
import com.dcr.secondkill.vo.GoodsVo;

/**
 * 服务类
 *
 * @author LiChao
 * @since 2022-03-03
 */
public interface ITOrderService extends IService<TOrder> {

    /**
     * 秒杀
     *
     * @param user    用户对象
     * @param goodsVo 商品对象
     * @return com.dcr.secondkill.entity.TOrder
     * @author LC
     * @operation add
     * @date 1:44 下午 2022/3/4
     **/
    TOrder secKill(TUser user, GoodsVo goodsVo);

    /**
     * 订单详情方法
     *
     * @param orderId
     * @return com.dcr.secondkill.vo.OrderDeatilVo
     * @author LC
     * @operation add
     * @date 10:21 下午 2022/3/6
     **/
    OrderDeatilVo detail(Long orderId);

    /**
     * 获取秒杀地址
     *
     * @param user
     * @param goodsId
     * @return java.lang.String
     * @author LiChao
     * @operation add
     * @date 2:59 下午 2022/3/9
     **/
    String createPath(TUser user, Long goodsId);

    /**
     * 校验秒杀地址
     *
     * @param user
     * @param goodsId
     * @param path
     * @return boolean
     * @author LiChao
     * @operation add
     * @date 2:59 下午 2022/3/9
     **/
    boolean checkPath(TUser user, Long goodsId, String path);

    /**
     * 校验验证码
     * @author LiChao
     * @operation add
     * @date 3:52 下午 2022/3/9
     * @param tuser
     * @param goodsId
     * @param captcha
     * @return boolean
     **/
    boolean checkCaptcha(TUser tuser, Long goodsId, String captcha);
}
