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

    /***
     * test接口，返回helloworld
     * @param name
     * @return
     */
    @RequestMapping("helloname")
    public String helloName(@RequestParam  String name){
        return "你好"+name;
    }
}
