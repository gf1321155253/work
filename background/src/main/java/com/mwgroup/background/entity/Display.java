package com.mwgroup.background.entity;

import java.util.Date;

public class Display {
    private Integer id;

    private String title;

    private String text;

    private Date create_Time;

    private Date update_Time;

    private Byte isDeleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Date getCreateTime() {
        return create_Time;
    }

    public void setCreateTime(Date createTime) {
        this.create_Time = createTime;
    }

    public Date getUpdateTime() {
        return update_Time;
    }

    public void setUpdateTime(Date updateTime) {
        this.update_Time = updateTime;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Display{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", createTime=" + create_Time +
                ", updateTime=" + update_Time +
                ", isDeleted=" + isDeleted +
                '}';
    }
}