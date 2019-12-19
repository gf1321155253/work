package com.mwgroup.background.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.pagehelper.Page;
import com.mwgroup.background.dao.ConnectMapper;
import com.mwgroup.background.entity.Connect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectService {

    @Autowired
    private ConnectMapper connectMapper;

    //显示所有用户反馈的信息
    public Page<Connect> findallByType1(){
        return connectMapper.findallByType1();
    }

    //获取代理商申请所有数据
    public Page<Connect> findallByType0(){
        return connectMapper.findallByType0();
    }

    //改变审批状态
    public int updateByPrimaryKeySelective(Connect record){
        return connectMapper.updateByPrimaryKeySelective(record);
    }
}
