package com.garry.adapterClass;

/**
 * Created by Administrator on 2017/5/16 0016.
 * 待补充
 * 适配器：
 * 1.系统需要使用现有的类，而此类的接口不符合系统的需要。

 2.想要建立一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作，这些源类不一定有一致的接口。

 3.通过接口转换，将一个类插入另一个类系中。
 */
public class AdapterInterface implements HIV {

    HDMI hdmi;

    public AdapterInterface(HDMI hdmi){
        this.hdmi = hdmi;
    }
    @Override
    public void workHIXV() {
        hdmi.needHDMI();
    }
}
