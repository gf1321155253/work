package com.example.demo.entity;

import org.apache.ibatis.type.Alias;

@Alias("brand")
public class Brand {

    private Integer id;
    private String goodstype;
    private Float goodsprice;
    private String goodsbrand;
    private String goodsname;

    public Brand(){

    }

    public Brand(String goodstype, Float goodsprice,String goodsbrand,String goodsname) {
        this.goodstype = goodstype;
        this.goodsprice = goodsprice;
        this.goodsbrand = goodsbrand;
        this.goodsname = goodsname;
    }

    public Brand(int id, String goodstype, Float goodsprice,String goodsbrand,String goodsname) {
        this.id = id;
        this.goodstype = goodstype;
        this.goodsprice = goodsprice;
        this.goodsbrand = goodsbrand;
        this.goodsname = goodsname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype == null ? null : goodstype.trim();
    }

    public Float getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Float goodsprice) {
        this.goodsprice = goodsprice;
    }

    public String getGoodsbrand() {
        return goodsbrand;
    }

    public void setGoodsbrand(String goodsbrand) {
        this.goodsbrand = goodsbrand == null ? null : goodsbrand.trim();
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname == null ? null : goodsname.trim();
    }
}

