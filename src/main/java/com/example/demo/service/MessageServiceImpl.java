package com.example.demo.service;

import com.example.demo.dao.MessageDao;
import com.example.demo.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;

    @Override
    public int deleteMessage(String mid) {
        return messageDao.deleteMessage(mid);
    }

    @Override
    public int insertMessage(Message message) {
        return messageDao.insertMessage(message);
    }

    @Override
    public List<Message> selectMessageByfid(String fid) {
        return messageDao.selectMessageByfid(fid);
    }
}
