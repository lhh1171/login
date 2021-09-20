package com.example.demo.entity;




/**
 * @author lqc
 */
public class User {

    String uid;
    String name;
    String did;
    String password;

    public User(String uid, String name, String did, String password) {
        this.uid = uid;
        this.name = name;
        this.did = did;
        this.password = password;
    }

    public User() {
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public String getDid() {
        return did;
    }

    public String getPassword() {
        return password;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
