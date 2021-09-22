package com.example.demo.service;

import com.example.demo.entity.Friends;
import java.util.List;

public interface FriendsService {
    int deleteFriends(String fid);
    int insertFriend(Friends friends);
    List<Friends> selectFriendByIUid(String uid);
}
