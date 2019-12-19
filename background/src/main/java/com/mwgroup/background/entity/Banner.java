package com.mwgroup.background.entity;

import java.util.Date;

public class Banner {
    private Integer id;

    private String imgUrlList;

    private String bannerScene;

    private Date create_time;

    private Date update_time;

    private Byte is_deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgUrlList() {
        return imgUrlList;
    }

    public void setImgUrlList(String imgUrlList) {
        this.imgUrlList = imgUrlList == null ? null : imgUrlList.trim();
    }

    public String getBannerScene() {
        return bannerScene;
    }

    public void setBannerScene(String bannerScene) {
        this.bannerScene = bannerScene == null ? null : bannerScene.trim();
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
        return "Banner{" +
                "id=" + id +
                ", imgUrlList='" + imgUrlList + '\'' +
                ", bannerScene='" + bannerScene + '\'' +
                ", createTime=" + create_time +
                ", updateTime=" + update_time +
                ", isDeleted=" + is_deleted +
                '}';
    }
}