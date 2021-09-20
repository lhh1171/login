package com.example.demo.entity;


public class Friends {
    String fid;
    String uid;
    String _uid;

    public Friends(String fid, String uid, String _uid) {
        this.fid = fid;
        this.uid = uid;
        this._uid = _uid;
    }

    public Friends() {
    }

    public String getFid() {
        return fid;
    }

    public String getUid() {
        return uid;
    }

    public String get_uid() {
        return _uid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void set_uid(String _uid) {
        this._uid = _uid;
    }
}
