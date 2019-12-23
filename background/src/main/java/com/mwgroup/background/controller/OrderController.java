package com.mwgroup.background.controller;

/*
* 描述：订单查询
* */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.Display;
import com.mwgroup.background.entity.Order;
import com.mwgroup.background.service.OrderService;
import com.mwgroup.background.utils.PagesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mw/order")
@CrossOrigin
public class OrderController {

    @Autowired
    private OrderService orderService;

    //显示所有订单数据
    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public List<Order> findall(Integer pageNum, Integer pageSize, Long pid, Long uid){
        PageHelper.startPage(pageNum,pageSize);

        if (uid == null && pid == null){
            Page<Order> page = orderService.findall();
            List<Order> list = PagesUtils.data(pageNum,pageSize,page);
            System.out.println(list);
            return list;
        }
        else {
            Page<Order> page = orderService.select(uid,pid);
            List<Order> list = PagesUtils.data(pageNum,pageSize,page);
            return list;
        }
    }

}
