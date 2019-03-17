package com.gjl.singleton.doublesin;

/**
 * @author gjl
 * @create 2019-03-17 11:47
 **/
public class DoubleSingleton {
    private static volatile DoubleSingleton singleton;

    private DoubleSingleton() {}

    public static DoubleSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleSingleton();
                }
            }
        }
        return singleton;
    }
}
