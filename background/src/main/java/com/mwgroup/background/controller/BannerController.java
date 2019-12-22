package com.mwgroup.background.controller;

import com.mwgroup.background.entity.Banner;
import com.mwgroup.background.service.BannerService;
import com.mwgroup.background.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/*
* 描述：各种场景的图片管理
* */

@CrossOrigin
@RestController
@RequestMapping(value = "/mw/banner")
public class BannerController {

    @Autowired
    private BannerService bannerService;

    //查询所有图片
    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public List<List<Banner>> findall(){
        List<Banner> list1 = bannerService.findallByScence1();
        List<Banner> list2 = bannerService.findallByScence2();
        List<Banner> list3 = bannerService.findallByScence3();
        List<Banner> list4 = bannerService.findallByScence4();
        List<List<Banner>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);

        return list;
    }


    //虚拟删除
    @RequestMapping(value = "del",method = RequestMethod.GET)
    public int del(Integer id) throws ParseException {
        Banner record = new Banner();
        record.setId(id);
        record.setUpdateTime(DateUtils.date());
        record.setIsDeleted((byte)1);
        return bannerService.updateByPrimaryKeySelective(record);
    }

    //新增图片
    @RequestMapping(value = "insert",method = RequestMethod.GET)
    public int insert(Banner record) throws ParseException {
        record.setCreateTime(DateUtils.date());
        record.setUpdateTime(DateUtils.date());
        return bannerService.insertSelective(record);
    }
}
