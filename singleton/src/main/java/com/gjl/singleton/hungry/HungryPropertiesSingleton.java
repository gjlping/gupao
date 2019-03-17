package com.gjl.singleton.hungry;

/**
 * 静态属性饿汉单例模式
 * @author gjl
 * @date 10:11 2019/3/17
 */
public class HungryPropertiesSingleton {
    private static final HungryPropertiesSingleton hungrySingleton = new HungryPropertiesSingleton();

    private HungryPropertiesSingleton(){}

    public static HungryPropertiesSingleton getInstance(){
        return  hungrySingleton;
    }
}
