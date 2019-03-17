package com.gjl.prototype;

import java.util.ArrayList;

/**
 * @author gjl
 * @create 2019-03-17 12:14
 **/
public class MyCloneTest {
    public static void main(String[] args) {
        MyClone myClone = new MyClone();
        myClone.setName("name1");
        myClone.setType(1);
        myClone.setList(new ArrayList<String>(){{add("111");add("222");}});
        //浅copy
        MyClone copymyClone = myClone.shallowClone();
        System.out.println("浅复制过的list:" + myClone.getList() + ":" + copymyClone.getList());


        //深copy
        MyClone copymyClone2 = copymyClone.deepClone();
        System.out.println("深复制过的list：" + myClone.getList() + ":" + copymyClone2.getList());

    }
}
