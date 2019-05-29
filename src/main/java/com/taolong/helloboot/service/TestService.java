package com.taolong.helloboot.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {
    /***
     *
     * @param name
     * @return
     */
    public String test(String name){
        return "你好啊亲爱的"+name;
    }
}
