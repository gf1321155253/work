package com.mwgroup.background.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.Product;
import com.mwgroup.background.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/*
* 描述：算力产品的增删改查
* */

@RestController
@RequestMapping(value = "/mw/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    //显示所有算力产品
    @CrossOrigin
    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public Page<Product> all(Integer pageNum,Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        return productService.findall();
    }

    //删除算力产品 删除成功返回1
    @CrossOrigin
    @RequestMapping(value = "del",method = RequestMethod.GET)
    public int del(Long id){
        return productService.del(id);
    }

    //新增算力产品
    @CrossOrigin
    @RequestMapping(value = "insert",method = RequestMethod.GET)
    public int insert(Product record){

        return productService.insertSelective(record);
    }

    //修改算力产品
    @CrossOrigin
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public int update(Product record){

        return productService.updateByPrimaryKeySelective(record);
    }

    //查询算力 根据算力名称和产品id
    @CrossOrigin
    @RequestMapping(value = "select",method = RequestMethod.GET)
    public Page<Product> select(Integer pageNum,Integer pageSize,String title, Long id){
        PageHelper.startPage(pageNum,pageSize);
        if (title == null && id == null){
            return productService.findall();
        }
        else {
            return productService.select(title,id);
        }
    }

}
