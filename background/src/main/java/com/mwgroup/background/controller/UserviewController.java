package com.mwgroup.background.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.Userview;
import com.mwgroup.background.service.UserIdentifyService;
import com.mwgroup.background.service.UserviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * 描述：用户信息的显示
 * */


@CrossOrigin
@RestController
@RequestMapping(value = "/mw/userview")
public class UserviewController {

    @Autowired
    private UserviewService userViewService;
    @Autowired
    private UserIdentifyService userIdentifyService;

    //未审核用户数据
    @RequestMapping(value = "findallByStatus0",method = RequestMethod.GET)
    public Page<Userview> findallByStatus0(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userViewService.findallByStatus0();
    }


    //已审核用户数据
    @RequestMapping(value = "findallByStatus12",method = RequestMethod.GET)
    public Page<Userview> findallByStatus12(Integer pageNum, Integer pageSize,Long uid){
        PageHelper.startPage(pageNum,pageSize);
        if (uid == null){
            return userViewService.findallByStatus12();
        }
        else {
            return userViewService.select(uid);
        }
    }


    //修改审核状态
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public int update(Long uid,Byte status){
        return userIdentifyService.update(uid,status);
    }
    
}
