package com.dky.eureka.domain.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User")
@Table(name = "sys_user")
public class User {
    @Id
    @Column(name = "id")
    private Integer id;

    /**
     * 用户代码
     */
    @ApiModelProperty(value = "用户代码")
    @Column(name = "userCode")
    private String usercode;

    /**
     * 用户名称
     */
    @ApiModelProperty(value = "用户名称")
    @Column(name = "userName")
    private String username;
}