package com.mwgroup.background.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mwgroup.background.entity.Product;
import com.mwgroup.background.service.ProductService;
import com.mwgroup.background.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;


/*
* 描述：算力产品的增删改查
* */

@CrossOrigin
@RestController
@RequestMapping(value = "/mw/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    //显示所有算力产品 默认的
    //查询算力 根据算力名称和产品id
    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public Page<Product> select(Integer pageNum,Integer pageSize,String title, Long id){
        PageHelper.startPage(pageNum,pageSize);
        if (title == null && id == null){
            return productService.findall();
        }
        else {
            return productService.select(title,id);
        }
    }
    //获取所有页数
    @RequestMapping(value = "page",method = RequestMethod.GET)
    public int page(Integer pageNum,Integer pageSize){
        Page page = PageHelper.startPage(pageNum,pageSize);
        productService.findall();
        return page.getPages();
    }


    //删除算力产品 删除成功返回1
    @RequestMapping(value = "del",method = RequestMethod.GET)
    public int del(Long id){
        return productService.del(id);
    }


    //新增算力产品
    @RequestMapping(value = "insert",method = RequestMethod.GET)
    public int insert(Product record) throws ParseException {
        record.setCreateTime(DateUtils.date());
        record.setUpdateTime(DateUtils.date());
        return productService.insertSelective(record);
    }


    //根据id查询产品数据  修改页面的数据
    @RequestMapping(value = "select",method = RequestMethod.GET)
    public Product select(Long id){
        return productService.selectById(id);
    }
    //修改算力产品
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public int update(Product record) throws ParseException {
        record.setUpdateTime(DateUtils.date());
        return productService.updateByPrimaryKeySelective(record);
    }




}
