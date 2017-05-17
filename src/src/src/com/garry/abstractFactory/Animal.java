package com.garry.abstractFactory;

/**
 * Created by Administrator on 2017/5/16 0016.
 * spring的BeanFactory就是这种模式实现的。
 * 抽象工厂：
 *适用场景：
 一个继承体系中，如果存在着多个等级结构（即存在着多个抽象类），并且分属各个等级结构中的实现类之间存在着一定的关联或者约束，就可以使用抽象工厂模式。
 */
public interface Animal {
    void eat();
}
