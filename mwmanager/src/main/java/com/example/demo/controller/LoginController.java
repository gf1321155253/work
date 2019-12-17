package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
* 描述：用户控制
* */

@RestController
@RequestMapping("/mw/user")
public class LoginController {

    @Autowired
    private UserService usersService;


    /*
    * 用户登录
    * */
    @CrossOrigin    //解决跨域问题
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(Users users) {
        System.out.println(usersService.select(users.getMobile()));

        System.out.println(users.getMobile());
        System.out.println(users.getPassword());
        //返回0是错误的 返回1是正确的
//        if (usersService.select(users) == (null)){
//            return "0";
//        }
        return "1";
    }

}
