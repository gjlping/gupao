package com.gjl.singleton.enums;

/**
 * 枚举单例
 * @author gjl
 * @create 2019-03-17 11:48
 **/
public enum EnumSingleton {
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
