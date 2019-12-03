package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value = "/gethello")
    public String hello(){
        return "gethello";
    }

    @PostMapping(value = "/posthello")
    public String posthello(){
        return "posthello";
    }

}
