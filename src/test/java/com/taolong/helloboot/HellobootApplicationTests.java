package com.taolong.helloboot;

import com.taolong.helloboot.controller.TestController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HellobootApplicationTests {

    @Autowired
    private TestController testController;

    @Test
    public void contextLoads() {
        Assert.assertEquals("1","1");
    }

    @Test
    public void test(){
        Assert.assertEquals("2","2");
    }

    @Test
    public void testControllerHello(){
        String name = "hongtaolong";
        String result = testController.helloName(name);
        Assert.assertEquals("你好啊"+name,result);
    }
    
    /*@Test
    public void testWrong(){
        Assert.assertEquals("1","2");
    }*/

}
