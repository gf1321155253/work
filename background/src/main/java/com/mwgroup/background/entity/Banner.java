package com.mwgroup.background.entity;

import java.util.Date;

public class Banner {
    private Integer id;

    private String imgUrlList;

    private String bannerScene;

    private Date createTime;

    private Date updateTime;

    private Byte isDeleted;

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
        return "Banner{" +
                "id=" + id +
                ", imgUrlList='" + imgUrlList + '\'' +
                ", bannerScene='" + bannerScene + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", isDeleted=" + isDeleted +
                '}';
    }
}