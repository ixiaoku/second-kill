package com.dcr.secondkill.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dcr.secondkill.entity.TGoods;
import com.dcr.secondkill.vo.GoodsVo;

import java.util.List;

/**
 * 商品表 服务类
 *
 * @author LiChao
 * @since 2022-03-03
 */
public interface ITGoodsService extends IService<TGoods> {

    /**
     * 返回商品列表
     * @return
     */
    List<GoodsVo> findGoodsVo();

    /**
     * 获取商品详情
     * @param goodsId
     * @return
     */
    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
