package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UsersService;
import com.sun.deploy.net.HttpResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/*
* 描述：用户控制
* */

@Api(value = "用户接口")
@RestController
@RequestMapping("/mw/user")
public class LoginController {
    @Autowired
    private UsersService usersService;

    @ApiOperation(value = "用户登陆")
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public HttpResponse login(@RequestBody Users users){
        List<Users> usersList = usersService.findall();
            System.out.println(usersList);
        return null;
    }

}
