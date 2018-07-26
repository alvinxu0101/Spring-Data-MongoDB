package com.alvinxu.momgo.test;

import com.alvinxu.jpa.data.User;
import com.alvinxu.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"})
public class UserInsertTest {
    @Autowired
    UserService userService;

    @Test
    public void getUser() {
        userService.insertUser();
        List<User> list = userService.getList();
        for (User user:list){
            System.out.println(user.getId());
            System.out.println(user.getName());
            System.out.println(user.getAddress());
        }
        userService.updataUser(2);
        userService.deleteUser(2);
    }
}
