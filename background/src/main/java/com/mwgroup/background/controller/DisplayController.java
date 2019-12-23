package com.mwgroup.background.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.Display;
import com.mwgroup.background.service.DisplayService;
import com.mwgroup.background.utils.DateUtils;
import com.mwgroup.background.utils.PagesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;



/*
* 描述：通知公告的增删改查
* */

@CrossOrigin
@RestController
@RequestMapping(value = "/mw/display")
public class DisplayController {

    @Autowired
    private DisplayService displayService;

    //显示所有的通知公告
    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public List all(Integer pageNum, Integer pageSize){     //pageNum表示第几页  pageSize表示一页有几个数据
        PageHelper.startPage(pageNum,pageSize);
        Page<Display> page = displayService.findall();
        List<Display> list = PagesUtils.data(pageNum,pageSize,page);
        return list;
    }

    //根据id删除通知公告(update set操作)
    @RequestMapping(value = "del",method = RequestMethod.GET)
    public int deleteById(Integer id){
        return displayService.delBuId(id);
    }

    //新增功能
    @RequestMapping(value = "insert",method = RequestMethod.GET)
    public int insert(Display record) throws ParseException {
        record.setCreateTime(DateUtils.date());
        record.setUpdateTime(DateUtils.date());
        return displayService.insertSelective(record);
    }

    //根据id查询Text 也可实现编辑的操作
    @RequestMapping(value = "select",method = RequestMethod.GET)
    public Display selectByPrimaryKey(Integer id){
        return displayService.selectByPrimaryKey(id);
    }

    //编辑提交 成功返回1
    @RequestMapping(value = "update",method = RequestMethod.GET)
    public int update(Display record) throws ParseException {
        record.setUpdateTime(DateUtils.date());
        record.setTitle(record.getTitle());
        record.setText(record.getText());
        return displayService.updateByPrimaryKeySelective(record);
    }

}
