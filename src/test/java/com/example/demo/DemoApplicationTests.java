package com.example.demo;

import com.example.demo.controller.DataController;
import com.example.demo.controller.FriendController;
import com.example.demo.controller.MessageController;
import com.example.demo.controller.UserController;
import com.example.demo.dao.UserDao;
import com.example.demo.entity.Friends;
import com.example.demo.entity.Message;
import com.example.demo.entity.User;
import com.example.demo.entity.UserData;
import com.example.demo.service.*;
import javafx.application.Application;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
class DemoApplicationTests {
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private UserDao userDao;

    @Autowired
    private FriendsServiceImpl friendsService;

    @Autowired
    private MessageServiceImpl messageService;

    @Test
    public void test() throws Exception {
        userDao.insertUser(new User("111","jdfsa","111","jajdhsf"));
        userDao.findUserByNameAndPassword("jdfsa","jajdhsf");
    }
}
