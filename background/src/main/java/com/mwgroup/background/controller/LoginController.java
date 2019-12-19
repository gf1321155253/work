package com.mwgroup.background.controller;

import com.mwgroup.background.entity.User;
import com.mwgroup.background.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*
* 描述：用户登陆验证
* */

@RestController
@RequestMapping(value = "/mw/user")
public class LoginController {

    @Autowired
    private UserService userService;


    /*
    * 正确返回1 错误返回0
    * */
    @CrossOrigin
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(User user, HttpServletRequest request){
        HttpSession session = request.getSession();
        session.setAttribute("user","user");
        User u = userService.selectByMobile(user);
        if (u == null){
            return "0";
        }
        if (user.getPassword().equals(u.getPassword())){
            return "1";
        }
        return "0";
    }
}
