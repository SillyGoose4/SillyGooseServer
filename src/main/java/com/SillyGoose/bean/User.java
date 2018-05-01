package com.SillyGoose.bean;

import java.util.Date;

public class User {
    private Long userId;

    private String userName;

    private String userPasswd;

    private String userPhone;

    private Date createtime;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd == null ? null : userPasswd.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
    public User(Long userId,
                String userName,
                String userPasswd,
                String userPhone){
        this.userId=userId;
        this.userPhone=userPhone;
        this.userName=userName;
        this.userPasswd=userPasswd;
    }
    public User(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}