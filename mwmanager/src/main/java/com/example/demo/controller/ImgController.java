package com.example.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
* 描述：图片管理
* */

@RestController
@RequestMapping("/mw")
public class ImgController {

    @CrossOrigin
    @RequestMapping(value = "img", method = RequestMethod.GET)
    public String img() throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();

//        Users users = new Users();
//        users.setId(1);
//        users.setUserpassword("1m");
//        users.setUsername("1u");
//        String str = om.writeValueAsString(users);


        return "str";
    }
}
