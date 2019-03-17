package com.gjl.strategy;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gjl
 * @create 2019-03-17 17:06
 **/
public class UserModel {
    private String uid;
    private String uname;
    private double account;

    static ConcurrentHashMap<String,UserModel> userInfo = new ConcurrentHashMap();
    static {
        userInfo.put("ali",new UserModel("1","阿里账号",500));
        userInfo.put("wechat",new UserModel("1","微信账号",200));
    }
    public static UserModel getUserModel(String name){
        return userInfo.get(name);
    }

    public UserModel(String uid, String uname, double account) {
        this.uid = uid;
        this.uname = uname;
        this.account = account;
    }

    public UserModel() {
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}
