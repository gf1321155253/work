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

    private Byte periodType;

    private Byte type;

    private Byte source;

    private Byte sort;

    private Date createTime;

    private Date updateTime;

    private Byte isDeleted;

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
        return periodType;
    }

    public void setPeriodType(Byte periodType) {
        this.periodType = periodType;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
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
                ", periodType=" + periodType +
                ", type=" + type +
                ", source=" + source +
                ", sort=" + sort +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}