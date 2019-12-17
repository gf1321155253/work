package com.example.demo.service;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.Users;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
* 描述： 用户登陆服务类
* */

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    //根据用户名查询密码
    public String select(String mobile){
        return userMapper.select(mobile);
    }

}
