package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.entity.UserData;

import java.util.List;

public interface DataService {
    int deletedata(UserData data);
    int insertdata(UserData data);
    List<UserData> selectBydid(String did);
    boolean updatedataz(UserData data);
}
