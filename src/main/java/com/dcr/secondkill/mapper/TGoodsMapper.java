package com.dcr.secondkill.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dcr.secondkill.entity.TGoods;
import com.dcr.secondkill.vo.GoodsVo;

import java.util.List;

/**
 * 商品表 Mapper 接口
 *
 * @author LiChao
 * @since 2022-03-03
 */
public interface TGoodsMapper extends BaseMapper<TGoods> {

    /**
     * 返回商品列表
     * @author LC
     * @operation add
     * @date 5:50 下午 2022/3/3
     * @param
     * @return java.util.List<com.example.seckilldemo.vo.GoodsVo>
     **/
    List<GoodsVo> findGoodsVo();

    /**
     * 查询商品
     * @param goodsId
     * @return
     */
    GoodsVo findGoodsVobyGoodsId(Long goodsId);
}
