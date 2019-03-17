package com.gjl.strategy;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gjl
 * @create 2019-03-17 17:17
 **/
public class PayStrategy {
    public static final String ALI_PAY = "ali";
    public static final String WECHAT_PAY = "wechat";

    private static ConcurrentHashMap<String,Payment> payStrategy = new ConcurrentHashMap<String,Payment>();
    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
    }

    public static Payment get(String payKey){
        return payStrategy.get(payKey);
    }
}