package com.mwgroup.background.utils;

/*
* 生成时间工具类
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static Date date() throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sd = sdf.format(date);
        Date sdate = sdf.parse(sd);
        return sdate;
    }

}
