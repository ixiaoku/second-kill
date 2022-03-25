package com.dcr.secondkill.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 *
 * @author LiChao
 * @since 2022-03-02
 */
@TableName("t_user")
@ApiModel(value = "用户表", description = "用户表")
@Data
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户ID,手机号码")
    private Long id;

    @ApiModelProperty("用户昵称")
    private String nickname;

    @ApiModelProperty("MD5(MD5(pass明文+固定salt)+salt)")
    private String password;

    private String salt;

    @ApiModelProperty("头像")
    private String head;

    @ApiModelProperty("注册时间")
    private Date registerDate;

    @ApiModelProperty("最后一次登录事件")
    private Date lastLoginDate;

    @ApiModelProperty("登录次数")
    private Integer loginCount;

}
