package com.gjl.taa;

/**
 * @author gjl
 * @create 2019-03-17 18:17
 **/
public class AdapteeFlowerTest {
    public static void main(String[] args) {
        //类适配器方式
        ClasAdapterFlower clasAdapterFlower = new ClasAdapterFlower();
        System.out.println(clasAdapterFlower.getOneBindFlower());
    }
}
