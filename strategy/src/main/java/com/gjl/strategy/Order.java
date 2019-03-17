package com.gjl.strategy;

/**
 * @author gjl
 * @create 2019-03-17 16:58
 **/
public class Order {
    public String uid;
    public double amount;

    public Order(String uid, double amount) {
        this.uid = uid;
        this.amount = amount;
    }

    public String pay(String payName){
        return PayStrategy.get(payName).pay(this.uid,this.amount);
    }
}
