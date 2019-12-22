package com.mwgroup.background.controller;

/*
* 描述：订单查询
* */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.Order;
import com.mwgroup.background.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/mw/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    //显示所有订单数据
    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public Page<Order> findall(Integer pageNum,Integer pageSize,Long pid,Long uid){
        PageHelper.startPage(pageNum,pageSize);
        if (uid == null && pid == null){
            return orderService.findall();
        }
        else {
            return orderService.select(uid,pid);
        }
    }
    //获取所有页数
    @RequestMapping(value = "pagep",method = RequestMethod.GET)
    public int pagep(Integer pageNum,Integer pageSize,Long pid){
        Page page = PageHelper.startPage(pageNum,pageSize);
        orderService.findall();
        return page.getPages();
    }


}
