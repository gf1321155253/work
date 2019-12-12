package com.mwgroup.block.entity;

import lombok.Data;

import java.util.Date;

/**
 * 描述:
 *
 * @author jinb.z
 * @create 2019-11-25 00:44
 */
@Data
public class ConnectEntity {
    /**自增Id*/
    private Integer id;
    /**用户ID*/
    private Long uid;
    /**手机*/
    private String mobile;
    /**邮箱*/
    private String email;
    /**类型*/
    private Integer type;
    /**内容*/
    private String desc;
    /**状态*/
    private Integer states;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
    /**是否删除*/
    private Byte isDeleted;
}
