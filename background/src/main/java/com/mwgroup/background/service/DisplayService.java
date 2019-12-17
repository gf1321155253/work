package com.mwgroup.background.service;


import com.github.pagehelper.Page;
import com.mwgroup.background.dao.DisplayMapper;
import com.mwgroup.background.entity.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisplayService {

    @Autowired
    private DisplayMapper displayMapper;

    //查询所有数据
    public Page<Display> findall(){
        return displayMapper.findall();
    }

    //虚拟删除
    public int delBuId(int id){
        return displayMapper.delById(id);
    }

    //新增公告
    public int insertSelective(Display record){
        return displayMapper.insertSelective(record);
    }

    //查询公告 编辑公告
    public Display selectByPrimaryKey(Integer id){
        return displayMapper.selectByPrimaryKey(id);
    }

    //编辑公告提交
    public int updateByPrimaryKeySelective(Display record){
        return displayMapper.updateByPrimaryKeySelective(record);
    }
}
