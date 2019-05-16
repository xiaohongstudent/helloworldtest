package com.taolong.helloboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HellobootApplicationTests {

    @Test
    public void contextLoads() {

    }

    @Test
    public void test(){
        Object o = null;
        System.out.println(o.toString());
    }

}
