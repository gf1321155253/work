package com.mwgroup.background.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mwgroup.background.entity.UserView;
import com.mwgroup.background.service.UserViewService;
import org.hibernate.validator.internal.metadata.aggregated.rule.ReturnValueMayOnlyBeMarkedOnceAsCascadedPerHierarchyLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * 描述：用户信息的显示
 * */


@CrossOrigin
@RestController
@RequestMapping(value = "/mw/userview")
public class UserViewController {

    @Autowired
    private UserViewService userViewService;

    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public Page<UserView> all(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return userViewService.findall();
    }

    @RequestMapping(value = "selectById",method = RequestMethod.GET)
    public UserView selectById(Long id){

        return userViewService.selectById(id);
    }
}
