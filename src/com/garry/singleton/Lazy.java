package com.garry.singleton;

/**
 * Created by Administrator on 2017/5/16 0016.
 * 注意线程安全，不然可能new出多个对象，不过饿汉式似乎没有这种问题。
 * 适用：
 1 需要频繁实例化然后销毁的对象。
 2 创建对象时耗时过多或者耗资源过多，但又经常用到的对象。
 3 有状态的工具类对象。
 4 频繁访问数据库或文件的对象。
 5 以及其他我没用过的所有要求只有一个对象的场景
 */
public class Lazy {

    // 防止指令重排序
    private static volatile Lazy lazy = null;
    private Lazy(){}
    public static Lazy getInstance(){
        if(lazy == null){   //避免每次都访问同步锁
            synchronized (Lazy.class){
                if(lazy == null){
                    lazy = new Lazy();

                }
            }
        }
        return lazy;
    }
}
