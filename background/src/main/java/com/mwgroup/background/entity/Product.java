package com.mwgroup.background.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private Long pid;

    private String title;

    private BigDecimal rate;

    private Integer stock;

    private BigDecimal price;

    private Integer period;

    private Byte period_type;

    private Byte type;

    private Byte source;

    private Byte sort;

    private Date create_time;

    private Date update_time;

    private Byte is_deleted;

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

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public Byte getPeriodType() {
        return period_type;
    }

    public void setPeriodType(Byte periodType) {
        this.period_type = periodType;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreateTime(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
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

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", title='" + title + '\'' +
                ", rate=" + rate +
                ", stock=" + stock +
                ", price=" + price +
                ", period=" + period +
                ", periodType=" + period_type +
                ", type=" + type +
                ", source=" + source +
                ", sort=" + sort +
                ", createTime=" + create_time +
                ", updateTime=" + update_time +
                ", isDeleted=" + is_deleted +
                '}';
    }
}