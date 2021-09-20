package com.example.demo.controller;

import com.example.demo.entity.Message;
import com.example.demo.service.MessageService;
import com.example.demo.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MessageController {
    @Autowired
    private MessageServiceImpl messageService;


    @PostMapping(value = "/addMessage")
    @ResponseBody
    public String addMessage(String mid,String fid,String content,long timestamps,String renamee){
        if (messageService.insertMessage(new Message(mid,fid,content,timestamps,renamee))!=0){
            return "已添加";
        }
        return "该用户已存在，添加失败";
    }


    @PostMapping(value = "/findMessage")
    @ResponseBody
    public List<String> seletedMessage(String fid){
        return messageService.selectMessageByfid(fid);
    }


    @PostMapping(value = "/deleteMessage")
    @ResponseBody
    public String deleteMessage(String mid){
        if (messageService.deleteMessage(mid)!=0){
            return "删除成功";
        }
        return "删除失败";
    }
}
