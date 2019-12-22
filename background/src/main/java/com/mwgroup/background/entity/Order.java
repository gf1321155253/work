package com.mwgroup.background.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer id;

    private Long pid;

    private String title;

    private Long uid;

    private BigDecimal price;

    private Integer num;

    private Boolean type;

    private Boolean status;

    private Date create_time;

    private Date update_time;

    private Byte is_deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return create_time;
    }

    public void setCreateTime(Date createTime) {
        this.create_time = createTime;
    }

    public Date getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Date updateTime) {
        this.update_time = updateTime;
    }

    public Byte getIsDeleted() {
        return is_deleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.is_deleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", pid=" + pid +
                ", title='" + title + '\'' +
                ", uid=" + uid +
                ", price=" + price +
                ", num=" + num +
                ", type=" + type +
                ", status=" + status +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                ", is_deleted=" + is_deleted +
                '}';
    }
}