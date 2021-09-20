package com.example.demo.controller;

import com.example.demo.entity.Friends;
import com.example.demo.service.FriendsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class FriendController {
    @Autowired
    private FriendsServiceImpl friendsService;


    @PostMapping(value = "/addFriends")
    @ResponseBody
    public String addFriends(String fid,String uid,String _fid){
        if (friendsService.insertFriend(new Friends(fid,uid,_fid))!=0){
            return "该用户已添加";
        }
        return "添加失败";
    }


    @PostMapping(value = "/selectFriends")
    @ResponseBody
    public List<String> selectFriends(String uid){
        return friendsService.selectFriendByIUid(uid);
    }

    @PostMapping(value = "/deleteFriends")
    @ResponseBody
    public String deleteFriends(String fid){
        if (friendsService.deleteFriends(fid)!=0){
            return "删除成功";
        }
        return "删除失败";
    }
}
