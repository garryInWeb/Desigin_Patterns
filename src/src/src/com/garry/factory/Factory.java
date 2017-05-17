package com.garry.factory;

/**
 * Created by Administrator on 2017/5/16 0016.
 * 工厂模式
 * 面向接口编程
 */
public class Factory implements Animal{

    @Override
    public void eat() {
        System.out.println("eat");
    }
}
