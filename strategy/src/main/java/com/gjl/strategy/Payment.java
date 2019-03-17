package com.gjl.strategy;

import org.springframework.beans.BeanUtils;
import org.springframework.util.StringUtils;

/**
 * @author gjl
 * @create 2019-03-17 16:59
 **/
public abstract class Payment {
    public abstract String getPayName();

    public abstract String validaPay(String id,double amount);

    public String pay(String uid,double amount){
        String validaParams = validaPay(uid,amount);
        if(StringUtils.isEmpty(validaParams)){
            return "支付成功";
        }else{
            return validaParams;
        }
    }
}
