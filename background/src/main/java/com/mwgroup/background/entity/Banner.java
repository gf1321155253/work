package com.mwgroup.background.entity;

import java.util.Date;

public class Banner {
    private Integer id;

    private String img_url_list;

    private String banner_scene;

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
        return img_url_list;
    }

    public void setImgUrlList(String imgUrlList) {
        this.img_url_list = imgUrlList == null ? null : imgUrlList.trim();
    }

    public String getBannerScene() {
        return banner_scene;
    }

    public void setBannerScene(String bannerScene) {
        this.banner_scene = bannerScene == null ? null : bannerScene.trim();
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
                ", imgUrlList='" + img_url_list + '\'' +
                ", bannerScene='" + banner_scene + '\'' +
                ", createTime=" + create_time +
                ", updateTime=" + update_time +
                ", isDeleted=" + is_deleted +
                '}';
    }
}