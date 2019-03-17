package com.gjl.singleton.hungry;

/**
 * 静态块饿汉式单例和静态属性单例类似
 * @author gjl
 * @date 10:12 2019/3/17
 */
public class HungryStaticMethodSingleton {
    private static final HungryStaticMethodSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticMethodSingleton();
    }
    private HungryStaticMethodSingleton(){}
    public static HungryStaticMethodSingleton getInstance(){
        return  hungrySingleton;
    }
}
