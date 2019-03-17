package com.gjl.proxy.jdk;


import java.lang.reflect.Method;

/**
 * @author gjl
 * @create 2019-03-10 21:46
 **/
public class MyMeipo implements MyInvocationHandler{
    private Person person;
    public Object getInstnce(Person person)throws Exception{
        this.person = person;
        Class<?> clazz = person.getClass();
        return MyProxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.person,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，先确认需要");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话就开始办事情");
    }
}
