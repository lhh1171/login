package com.example.demo.dao;

import com.example.demo.entity.User;
import com.example.demo.entity.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class dataDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int deleteData(UserData data){
        return jdbcTemplate.update("delete from data where did=?",data.getDid());
    }

    public List<UserData> selectBydid(String did){
        final List<UserData> l=new ArrayList<>();
        String sql= "SELECT * FROM data WHERE did=?";
        jdbcTemplate.query(sql, new Object[]{did}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                l.add(new UserData(rs.getString(1),rs.getInt(2),rs.getString(3)));
            }
        });
        return l;
    }

    public int insertData(UserData data){
        return jdbcTemplate.update("insert into data(did,age,gender)values (?,?,?)",data.getDid(),data.getAge(),data.getGender());
    }

    public int Update(UserData data){
        return jdbcTemplate.update("UPDATE data SET did=?,age=?,gender=? WHERE did=?",data.getDid(),data.getAge(),data.getGender(),data.getDid());
    }
}
