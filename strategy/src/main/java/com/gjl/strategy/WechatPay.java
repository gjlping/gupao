package com.gjl.strategy;

/**
 * @author gjl
 * @create 2019-03-17 17:13
 **/
public class WechatPay extends Payment {
    @Override
    public String getPayName() {
        return "wechat";
    }

    @Override
    public String validaPay(String id, double amount) {
        //用户是否存在(忽略)和获取
        UserModel user = UserModel.getUserModel(getPayName());
        //金额是否足够
        if(user == null){
            return "用户不存在";
        }else if(user.getAccount() < amount){
            return "微信账号金额不足";
        }
        return null;
    }
}
