package com.mwgroup.background.entity;

import java.util.Date;

public class Userview {
    private Long uid;

    private String mobile;

    private String email;

    private String name;

    private Date update_time;

    private Byte userisdeleted;

    private String nationality;

    private String first_name;

    private String last_name;

    private Byte id_type;

    private String id_number;

    private Byte sex;

    private Byte status;

    private String front_img;

    private String back_img;

    private Date identifyupdateTime;

    private Byte identifydeleted;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getUpdateTime() {
        return update_time;
    }

    public void setUpdateTime(Date updateTime) {
        this.update_time = updateTime;
    }

    public Byte getUserisdeleted() {
        return userisdeleted;
    }

    public void setUserisdeleted(Byte userisdeleted) {
        this.userisdeleted = userisdeleted;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        this.first_name = firstName == null ? null : firstName.trim();
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        this.last_name = lastName == null ? null : lastName.trim();
    }

    public Byte getIdType() {
        return id_type;
    }

    public void setIdType(Byte idType) {
        this.id_type = idType;
    }

    public String getIdNumber() {
        return id_number;
    }

    public void setIdNumber(String idNumber) {
        this.id_number = idNumber == null ? null : idNumber.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getFrontImg() {
        return front_img;
    }

    public void setFrontImg(String frontImg) {
        this.front_img = frontImg == null ? null : frontImg.trim();
    }

    public String getBackImg() {
        return back_img;
    }

    public void setBackImg(String backImg) {
        this.back_img = backImg == null ? null : backImg.trim();
    }

    public Date getIdentifyupdateTime() {
        return identifyupdateTime;
    }

    public void setIdentifyupdateTime(Date identifyupdateTime) {
        this.identifyupdateTime = identifyupdateTime;
    }

    public Byte getIdentifydeleted() {
        return identifydeleted;
    }

    public void setIdentifydeleted(Byte identifydeleted) {
        this.identifydeleted = identifydeleted;
    }

    @Override
    public String toString() {
        return "Userview{" +
                "uid=" + uid +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", updateTime=" + update_time +
                ", userisdeleted=" + userisdeleted +
                ", nationality='" + nationality + '\'' +
                ", firstName='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                ", idType=" + id_type +
                ", idNumber='" + id_number + '\'' +
                ", sex=" + sex +
                ", status=" + status +
                ", frontImg='" + front_img + '\'' +
                ", backImg='" + back_img + '\'' +
                ", identifyupdateTime=" + identifyupdateTime +
                ", identifydeleted=" + identifydeleted +
                '}';
    }
}