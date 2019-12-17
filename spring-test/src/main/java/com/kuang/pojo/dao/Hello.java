package com.kuang.pojo.dao;

import java.sql.PreparedStatement;

public class Hello {
    private String str;

    public Hello(){
        System.out.println("我是hello类中的无参构造方法！");
    }

    public Hello(String str){
       this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }

    public void show(){
        System.out.println("我是show方法！");
    }
}
