package com.mwgroup.background.service;

import com.github.pagehelper.Page;
import com.mwgroup.background.dao.ProductMapper;
import com.mwgroup.background.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    //显示所有算力产品
    public Page<Product> findall(){
        return productMapper.findall();
    }

    //虚拟删除
    public int del(Long Id){
        return productMapper.del(Id);
    }

    //新增算力产品
    public int insertSelective(Product record){
        return productMapper.insertSelective(record);
    }

    //修改算力产品
    public int updateByPrimaryKeySelective(Product record){
        return productMapper.updateByPrimaryKeySelective(record);
    }

    //算力产品查询 搜索
    public Page<Product> select(String title,Long id){
        return productMapper.select(title,id);
    }

    //根据id查询数据 修改
    public Product selectById(Long id){
        return productMapper.selectById(id);
    }

}
