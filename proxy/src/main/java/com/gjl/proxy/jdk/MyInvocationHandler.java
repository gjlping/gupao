package com.gjl.proxy.jdk;

import java.lang.reflect.Method;

/**
 * @author gjl
 * @create 2019-03-17 13:12
 **/
public interface MyInvocationHandler {
    Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
