package com.example.demo.dao;


import com.example.demo.annotation.Cache;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertUser(User user){
        return jdbcTemplate.update("insert into user(uid,name,did,password)values (?,?,?,?)",user.getUid(),user.getName(),user.getDid(),user.getPassword());
    }

    public int deleteUser(String uid){
        return jdbcTemplate.update("delete from user where uid=?",uid);
    }

    @Cache
    public User findUserByNameAndPassword(String username,String password){
        final User user =new User();
        String sql="SELECT * FROM user WHERE name=? AND password=?";
        jdbcTemplate.query(sql, new Object[]{username, password}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                user.setUid(rs.getString(1));
                user.setName(rs.getString(2));
                user.setDid(rs.getString(3));
                user.setPassword(rs.getString(4));
            }
        });
        return user;
    }

    public User selectByUid(String uid){
        final User user = new User();
        String sql= "SELECT * FROM user WHERE uid=?";
        jdbcTemplate.query(sql, new Object[]{uid}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                user.setUid(rs.getString(1));
                user.setName(rs.getString(2));
                user.setDid(rs.getString(3));
                user.setPassword(rs.getString(4));
            }
        });
        return user;
    }

    public User selectByName(String name){
        final User user = new User();
        String sql= "SELECT * FROM user WHERE name=?";
        jdbcTemplate.query(sql, new Object[]{name}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                user.setUid(rs.getString(1));
                user.setName(rs.getString(2));
                user.setDid(rs.getString(3));
                user.setPassword(rs.getString(4));
            }
        });
        return user;
    }
}
