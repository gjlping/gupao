package com.gjl.strategy;

/**
 * @author gjl
 * @create 2019-03-17 16:58
 **/
public class StrategyTest {
    public static void main(String[] args) {
        Order order = new Order("1",550);
        System.out.println(order.pay("ali"));
    }
}
