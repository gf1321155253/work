package com.mwgroup.block.entity;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.Date;

/**
 * 描述:
 * 用户实体
 *
 * @author pcmd
 * @create 2019-11-20 01:12
 */

@Data
public class UserEntity {
    /**用户ID*/
    private Long uid;
    /**密码*/
    private String password;
    /**手机号*/
    private String mobile;
    /**邮箱*/
    private String email;
    /**姓名*/
    private String name;
    /**图片*/
    private String photo;
    /**创建时间*/
    private Date createTime;
    /**更新时间*/
    private Date updateTime;
    /**是否删除*/
    private Byte isDeleted;


}
