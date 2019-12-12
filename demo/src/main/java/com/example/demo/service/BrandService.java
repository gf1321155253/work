package com.example.demo.service;

import com.example.demo.dao.BrandMapper;
import com.example.demo.entity.Brand;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;

    public int deleteId(int id) {
        return brandMapper.deleteByPrimaryKey(id);
    }

    public List<Brand> findall() {
        return brandMapper.findall();
    }

    public int insert(Brand record) {
        return brandMapper.insert(record);
    }

    public int updateByPrimaryKey(Brand record) {
        return brandMapper.updateByPrimaryKey(record);
    }

    public List<Brand> mhselect(String goodsname){
        return brandMapper.mhselect(goodsname);
    }

//    分页查询语句
    public Page<Brand> getUserList() {
        return brandMapper.getUserList();
    }
}
