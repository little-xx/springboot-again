package com.littlexx.springbootagain;

import com.littlexx.springbootagain.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootagainApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testhelloService() {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
