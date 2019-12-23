package com.mwgroup.background.controller;

/*
* 描述：信箱管理，用户反馈
* */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.Connect;
import com.mwgroup.background.service.ConnectService;
import com.mwgroup.background.utils.PagesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping(value = "/mw/connect")
public class ConnectController {

    @Autowired
    private ConnectService connectService;

    //显示所有用户反馈信息
    @RequestMapping(value = "findallByType1",method = RequestMethod.GET)
    public List findallByType1(Integer pageNum, Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Page<Connect> page = connectService.findallByType1();
        List list = PagesUtils.data(pageNum,pageSize,page);
        return list;
    }



    //显示所有代理商反馈信息
    @RequestMapping(value = "findallByType0",method = RequestMethod.GET)
    public List findallByType0(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        Page<Connect> page = connectService.findallByType0();
        List list = PagesUtils.data(pageNum,pageSize,page);
        return list;
    }


    //改变审批状态
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public int update(Integer id,byte status) {
        return connectService.update(id,status);
    }

}
