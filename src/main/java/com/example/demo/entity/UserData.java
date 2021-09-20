package com.example.demo.entity;


/**
 * @author lqc
 */
public class UserData {

    String did;
    int age;
    String gender;

    public UserData(String did, int age, String gender) {
        this.did = did;
        this.age = age;
        this.gender = gender;
    }

    public UserData() {
    }

    public String getDid() {
        return did;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
