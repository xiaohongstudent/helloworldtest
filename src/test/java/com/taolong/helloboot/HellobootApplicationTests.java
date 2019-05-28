package com.taolong.helloboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HellobootApplicationTests {

    @Test
    public void contextLoads() {
        Assert.assertEquals("1","1");
    }

    @Test
    public void test(){
        Assert.assertEquals("2","2");
    }
    
    @Test
    public void testWrong(){
        Assert.assertEquals("1","2");
    }

}
