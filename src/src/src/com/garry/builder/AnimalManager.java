package com.garry.builder;

/**
 * Created by Administrator on 2017/5/16 0016.
 * 暂时没有接触相应实例，待后面补充
 * 建造者模式：
 * 需要生成的对象具有复杂的内部结构；需要生成的对象内部属性本身相互依赖。
 */
public class AnimalManager {
    Animal animal;
    public AnimalManager(Animal animal){
        this.animal = animal;
    }
    public void control(){
        animal.eat();
    }
}
