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

    //虚拟删除
    public int updateByPrimaryKeySelective(Banner record){
        return bannerMapper.updateByPrimaryKeySelective(record);
    }

    //新增图片
    public int insertSelective(Banner record){
        return bannerMapper.insertSelective(record);
    }
}
