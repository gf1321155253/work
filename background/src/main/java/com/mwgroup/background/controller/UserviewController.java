package com.mwgroup.background.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.Product;
import com.mwgroup.background.entity.Userview;
import com.mwgroup.background.service.UserIdentifyService;
import com.mwgroup.background.service.UserviewService;
import com.mwgroup.background.utils.PagesUtils;
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
    public List<Userview> findallByStatus0(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        Page<Userview> page = userViewService.findallByStatus0();
        List<Userview> list = PagesUtils.data(pageNum,pageSize,page);
        return list;
    }


    //已审核用户数据
    @RequestMapping(value = "findallByStatus12",method = RequestMethod.GET)
    public List<Userview> findallByStatus12(Integer pageNum, Integer pageSize,Long uid){
        PageHelper.startPage(pageNum,pageSize);
        if (uid == null){
            Page<Userview> page = userViewService.findallByStatus12();
            List<Userview> list = PagesUtils.data(pageNum,pageSize,page);
            return list;
        }
        else {
            Page<Userview> page = userViewService.select(uid);
            List<Userview> list = PagesUtils.data(pageNum,pageSize,page);
            return list;
        }
    }


    //修改审核状态
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public int update(Long uid,Byte status){
        return userIdentifyService.update(uid,status);
    }

    //根据uid显示用户所有信息
    @RequestMapping(value = "selectByuid",method = RequestMethod.GET)
    public List<Userview> select(long uid){
        return userViewService.select(uid);
    }
    
}
