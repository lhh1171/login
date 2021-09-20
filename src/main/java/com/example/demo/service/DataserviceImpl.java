package com.example.demo.service;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.dataDao;
import com.example.demo.entity.User;
import com.example.demo.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataserviceImpl implements DataService {
    @Autowired
    private dataDao dataDao;

    @Override
    public int deletedata(UserData data) {
        return dataDao.deleteData(data);
    }

    @Override
    public int insertdata(UserData data) {
        return dataDao.insertData(data);
    }

    @Override
    public UserData selectBydid(String did) {
        return dataDao.selectBydid(did);
    }

    @Override
    public boolean updatedataz(UserData data) {
        if (dataDao.Update(data)!=0){
            return true;
        }
        return false;
    }
}
