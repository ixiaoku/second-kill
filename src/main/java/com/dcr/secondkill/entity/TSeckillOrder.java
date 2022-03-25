package com.dcr.secondkill.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 秒杀订单表
 *
 * @author LiChao
 * @since 2022-03-03
 */
@TableName("t_seckill_order")
@ApiModel(value = "秒杀订单表", description = "秒杀订单表")
@Data
public class TSeckillOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("秒杀订单ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("用户ID")
    private Long userId;

    @ApiModelProperty("订单ID")
    private Long orderId;

    @ApiModelProperty("商品ID")
    private Long goodsId;
}
