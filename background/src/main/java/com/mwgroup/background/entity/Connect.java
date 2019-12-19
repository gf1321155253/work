package com.mwgroup.background.entity;

import java.util.Date;

public class Connect {
    private Integer id;

    private Long uid;

    private String mobile;

    private String email;

    private Byte type;

    private Byte states;

    private Date create_time;

    private Date update_time;

    private Byte is_deleted;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getStates() {
        return states;
    }

    public void setStates(Byte states) {
        this.states = states;
    }

    public Date getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Date update_time) {
        this.update_time = update_time;
    }

    public Byte getIsDeleted() {
        return is_deleted;
    }

    public void setIsDeleted(Byte is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    @Override
    public String toString() {
        return "Connect{" +
                "id=" + id +
                ", uid=" + uid +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                ", states=" + states +
                ", createTime=" + create_time +
                ", updateTime=" + update_time +
                ", isDeleted=" + is_deleted +
                ", desc='" + desc + '\'' +
                '}';
    }
}