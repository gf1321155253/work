package com.example.demo.service;

import com.example.demo.dao.UsersMapper;
import com.example.demo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
* 描述： 用户登陆服务类
* */

@Service
public class UsersService {
    @Autowired
    private UsersMapper usersMapper;

    public List<Users> findall(){
        return usersMapper.findall();
    }

}
