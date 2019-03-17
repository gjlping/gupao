package com.gjl.singleton.lazy;

/**
 * @author gjl
 * @create 2019-03-17 11:45
 **/
public class Singleton {

    private static Singleton singleton;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
