package com.garry.singleton;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public class Hungry {
    private static Hungry hungry = new Hungry();
    private Hungry(){}

    public static Hungry getInstance(){
        return hungry;
    }
}
