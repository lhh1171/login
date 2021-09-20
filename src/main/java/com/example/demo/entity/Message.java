package com.example.demo.entity;




/**
 * @author lqc
 */
public class Message {

    String mid;
    String fid;
    String content;
    long timestamps;
    String renamee;

    public Message() {
    }

    public Message(String mid, String fid, String content, long timestamps, String renamee) {
        this.mid = mid;
        this.fid = fid;
        this.content = content;
        this.timestamps = timestamps;
        this.renamee = renamee;
    }

    public String getMid() {
        return mid;
    }

    public String getFid() {
        return fid;
    }

    public String getContent() {
        return content;
    }

    public long getTimestamps() {
        return timestamps;
    }

    public String getRenamee() {
        return renamee;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setFid(String fid) {
        this.fid = fid;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTimestamps(long timestamps) {
        this.timestamps = timestamps;
    }

    public void setRenamee(String renamee) {
        this.renamee = renamee;
    }
}
