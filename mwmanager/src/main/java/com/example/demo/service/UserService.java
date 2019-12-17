package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 描述： 用户登陆服务类
* */

@Service
public class UsersService {
    @Autowired
    private UsersMapper userMapper;


    //根据用户名查询密码
    public Users selectByName(String mobile,String password){
        return userMapper.selectByName(mobile,password);
    }

    public List<Users> findall(){
        return userMapper.findall();
    }

}
