package com.gjl.proxy.jdk;

import com.gupao.demo.proxy.dynamic.jdk.Girl;
import com.gupao.demo.proxy.state.Person;

/**
 * @author gjl
 * @create 2019-03-10 21:31
 **/
public class MyProxyTest {
    public static void main(String[] args) throws Exception {
        Person person= (Person) new MyMeipo().getInstnce(new Girl());
        person.findLove();
    }
}
