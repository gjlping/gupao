package com.gjl.taa;

import java.lang.annotation.Target;

/**
 * @author gjl
 * @create 2019-03-17 18:16
 **/
public class ClasAdapterFlower extends AdapteeFlower implements TargetFlower {
    @Override
    public String getOneBindFlower() {
        String flower = getFlower();
        return "一束花";
    }
}
