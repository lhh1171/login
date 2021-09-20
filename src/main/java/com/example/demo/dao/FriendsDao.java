package com.example.demo.dao;

import com.example.demo.entity.Friends;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class FriendsDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int insertFriend(Friends friends){
        return jdbcTemplate.update("insert into friends(fid,uid,_uid)values (?,?,?)",friends.getFid(),friends.getUid(),friends.get_uid());
    }

    public int deleteFriends(String fid){
        return jdbcTemplate.update("delete from friends where fid=?",fid);
    }

    public List<String> selectFriendByUid(String uid){
        final List<String> fflist=new ArrayList<>();
        String sql= "SELECT mid FROM message WHERE fid=?";
        jdbcTemplate.query(sql, new Object[]{uid}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                fflist.add(rs.getString(1));
            }
        });
        return fflist;
    }
}
