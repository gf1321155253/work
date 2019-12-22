package com.mwgroup.background.service;

import com.github.pagehelper.Page;
import com.mwgroup.background.dao.OrderMapper;
import com.mwgroup.background.entity.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;

    //显示所有数据
    public Page<Order> findall(){
        return orderMapper.findall();
    }

    //根据uid 和 pid进行查询
    public Page<Order> select(Long uid,Long pid){
        return orderMapper.select(uid,pid);
    }
}
