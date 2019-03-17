package com.gjl.strategy;

/**
 * @author gjl
 * @create 2019-03-17 17:05
 **/
public class AliPay extends Payment {
    @Override
    public String getPayName() {
        return "ali";
    }

    @Override
    public String validaPay(String id, double amount) {
        //用户是否存在(忽略)和获取
        UserModel user = UserModel.getUserModel(getPayName());
        //金额是否足够
        if(user == null){
            return "用户不存在";
        }else if(user.getAccount() < amount){
            return "阿里账号金额不足";
        }
        return null;
    }

}
