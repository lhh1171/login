package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int deleteUser(String uid) {
        return userDao.deleteUser(uid);
    }

    @Override
    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public List<User> selectByuid(String uid) {
        return userDao.selectByUid(uid);
    }

    @Override
    public User findUserByNameAndPassword(String username, String password) {
        return userDao.findUserByNameAndPassword(username,password);
    }

    @Override
    public boolean register(String name) {
        if (userDao.selectByName(name)!=null){
            return true;
        }
        return false;
    }
}
