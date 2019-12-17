package com.mwgroup.background.service;

import com.mwgroup.background.dao.UserMapper;
import com.mwgroup.background.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectByMobile(User user){
        return userMapper.selectByMobile(user);
    }
}
