package com.mwgroup.background.utils;

import com.mwgroup.background.entity.Display;

import java.text.ParseException;

/*
* 添加通知公告工具类
* */

public class DisplayUtils {

    //新增通知公告
    public static Display displayadd(Display record){
        Display display = new Display();
        display.setTitle(record.getTitle());
        display.setText(record.getText());
        try {
            display.setCreateTime(DateUtils.date());
            display.setUpdateTime(DateUtils.date());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        display.setIsDeleted((byte) 0);

        return display;
    }

}
