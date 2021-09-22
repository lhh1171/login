package com.example.demo.controller;

import com.example.demo.entity.UserData;
import com.example.demo.service.DataserviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DataController {

    @Autowired
    private DataserviceImpl dataservice;

    @PostMapping(value = "/addData")
    @ResponseBody
    public String addData(String did,int age,String gender){
        dataservice.insertdata(new UserData(did,age,gender));
        return "该资料已添加";
    }


    @PostMapping(value = "/selectData")
    @ResponseBody
    public List<UserData> selectData(String did){
        return dataservice.selectBydid(did);
    }


    @PostMapping(value = "/updateData")
    public @ResponseBody String updateData(String did,int age,String gender){
        if (dataservice.updatedataz(new UserData(did,age,gender))){
            return "已更新";
        }
        return "不存在用户无法更新";
    }
}
