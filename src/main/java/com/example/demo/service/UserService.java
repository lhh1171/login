package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    int deleteUser(String uid);
    int insertUser(User user);
    List<User> selectByuid(String uid);
    User findUserByNameAndPassword(String username,String userid);
    boolean register(String name);
}
