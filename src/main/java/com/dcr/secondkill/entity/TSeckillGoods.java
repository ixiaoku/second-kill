package com.dcr.secondkill.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 秒杀商品表
 *
 * @author LiChao
 * @since 2022-03-03
 */
@TableName("t_seckill_goods")
@ApiModel(value = "秒杀商品表", description = "秒杀商品表")
@Data
public class TSeckillGoods implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("秒杀商品ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("商品ID")
    private Long goodsId;

    @ApiModelProperty("秒杀家")
    private BigDecimal seckillPrice;

    /** 库存数量 **/
    @ApiModelProperty("库存数量")
    private Integer stockCount;

    @ApiModelProperty("秒杀开始时间")
    private LocalDateTime startDate;

    @ApiModelProperty("秒杀结束时间")
    private LocalDateTime endDate;

}
