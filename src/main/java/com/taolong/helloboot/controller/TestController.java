package com.taolong.helloboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("helloname")
    public String helloName(@RequestParam  String name){
        return "test helltttTesto test world 123 dfgdfg"+name;
    }
}
