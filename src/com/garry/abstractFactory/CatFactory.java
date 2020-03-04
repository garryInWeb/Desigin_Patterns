package com.garry.abstractFactory;

/**
 * Created by Administrator on 2017/5/16 0016.
 */
public class CatFactory implements AnimalFactory{

    @Override
    public Animal burnAnimal() {
        return new Cat();
    }
}
