package com.example.demo.service;

import com.example.demo.dao.FriendsDao;
import com.example.demo.entity.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendsServiceImpl implements FriendsService {
    @Autowired
    private FriendsDao friendsDao;


    @Override
    public int deleteFriends(String fid) {
        return friendsDao.deleteFriends(fid);
    }

    @Override
    public int insertFriend(Friends friends) {
        return friendsDao.insertFriend(friends);
    }

    @Override
    public List<String> selectFriendByIUid(String uid) {
        return friendsDao.selectFriendByUid(uid);
    }

}
