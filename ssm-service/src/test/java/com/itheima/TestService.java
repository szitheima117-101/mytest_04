package com.itheima;

import com.itheima.service.ItemsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-service.xml")
public class TestService {
    @Autowired
    private ItemsService itemsService;
    @Test
    public void test01(){
        System.out.println(itemsService.findAll());

    }
}
