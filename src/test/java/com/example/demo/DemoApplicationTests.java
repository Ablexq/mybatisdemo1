package com.example.demo;

import com.example.demo.dao.UserMapper;
import com.example.demo.entry.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    UserMapper userMapper;

    @Test
    public void get() {
        User users = userMapper.selectByPrimaryKey(3);
        System.out.println("getUsername========" + users.getUsername());
        System.out.println("getPassword========" + users.getPassword());
    }

}

