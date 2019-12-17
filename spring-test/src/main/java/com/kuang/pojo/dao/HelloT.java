package com.kuang.pojo.dao;

public class HelloT {
    private String str;

    public HelloT(){
        System.out.println("我是hellot的无参构造！");
    }

    public HelloT(String str){
        System.out.println("我是HelloT的对象");
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
