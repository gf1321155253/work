package com.kuang.pojo.service;

import com.kuang.pojo.dao.HelloDao;
public class HelloServiceImpl implements HelloService{
    private HelloDao user;


    public void setUser(HelloDao user) {
        this.user = user;
    }

    public void getUser() {
        user.getUser();
    }
}
