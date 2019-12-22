package com.mwgroup.background.service;

import com.github.pagehelper.Page;
import com.mwgroup.background.dao.UserviewMapper;
import com.mwgroup.background.entity.Userview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserviewService {

    @Autowired
    public UserviewMapper userviewMapper;

    //未审核用户数据
    public Page<Userview> findallByStatus0(){
        return userviewMapper.findallByStatus0();
    }

    //已审核用户数据
    public Page<Userview> findallByStatus12(){
        return userviewMapper.findallByStatus12();
    }


    //根据uid显示用户所有信息
    public Page<Userview> select(long uid){
        return userviewMapper.select(uid);
    }
}
