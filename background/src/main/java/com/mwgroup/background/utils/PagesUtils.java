package com.mwgroup.background.utils;

/*
* 返回各个表对应的 所有数据+总页数
* */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagesUtils {
    public static List data(Integer pageNum, Integer pageSize, Page page){
        Map<Object,Object> map1 = new HashMap<Object, Object>();
        map1.put("page",page);
        map1.put("total",page.getPages());
        List<Object> list = new ArrayList<Object>();
        list.add(map1);
        return list;
    }
}
