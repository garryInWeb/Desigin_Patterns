package com.garry.facade;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * Created by Administrator on 2017/5/16 0016.
 * JAVABean
 * 外观：
 * 1.为复杂的模块或子系统提供外界访问的模块。

 2.客户程序与抽象类的实现部分之间存在着很大的依赖性。引入facade 将这个子系统与客户以及其他的子系统分离，可以提高子系统的独立性和可移植性。
 */
public class Computer {
    Cup cup;
    Memory memory;
    Disk disk;

    public Computer() {
        cup = new Cup();
        memory = new Memory();
        disk = new Disk();
    }
    public void start(){
        cup.start();
        memory.start();
        disk.start();
    }
}
