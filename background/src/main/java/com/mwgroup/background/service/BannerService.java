package com.mwgroup.background.service;

import com.mwgroup.background.dao.BannerMapper;
import com.mwgroup.background.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    //查询所有图片
    public List<Banner> findall(){
        return bannerMapper.findall();
    }

    // 查询场景为1的图片
    public List<Banner> findallByScence1() {
        return bannerMapper.findallByScence1();
    }

    // 查询场景为2的图片
    public List<Banner> findallByScence2() {
        return bannerMapper.findallByScence2();
    }

    // 查询场景为3的图片
    public List<Banner> findallByScence3() {
        return bannerMapper.findallByScence3();
    }

    // 查询场景为4的图片
    public List<Banner> findallByScence4() {
        return bannerMapper.findallByScence4();
    }

    //虚拟删除
    public int updateByPrimaryKeySelective(Banner record){
        return bannerMapper.updateByPrimaryKeySelective(record);
    }

    //新增图片
    public int insertSelective(Banner record){
        return bannerMapper.insertSelective(record);
    }
}
