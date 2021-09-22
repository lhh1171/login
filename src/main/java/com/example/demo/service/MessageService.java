package com.example.demo.service;

import com.example.demo.entity.Message;

import java.util.List;

public interface MessageService {
    int deleteMessage(String mid);
    int insertMessage(Message message);
    List<Message> selectMessageByfid(String fid);

}
