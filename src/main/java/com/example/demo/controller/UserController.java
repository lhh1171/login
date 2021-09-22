package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.example.demo.entity.User;

import com.example.demo.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;


    @PostMapping(value = "/test")
    @ResponseBody
    public String test(String name){
        if (userService.register(name)){
            return "该用户已存在";
        }
        return "该用户验证成功";
    }

    @PostMapping(value = "/selectbyid")
    public @ResponseBody List<User> selectbyid(String uid){
        List<User> userList = userService.selectByuid(uid);
//        JSONArray array= JSONArray.parseArray(JSON.toJSONString(userList));
//        return array;
        return userList;
    }

    @PostMapping(value = "/login")
    public @ResponseBody String login(String username,@RequestParam("password")  String password){
        if (userService.findUserByNameAndPassword(username,password).getUid()!=null){
            System.out.println("sssss");
            return "success";
        }
        return "error";
    }


    @PostMapping(value = "/register")
    @ResponseBody
    public String register(String uid,String name,String did,String password){
        if (userService.selectByuid(uid)==null){
            userService.insertUser(new User(uid,name,did,password));
            return "该注册成功";
        }
        return "该用户已存在，不能重复注册";
    }
}
