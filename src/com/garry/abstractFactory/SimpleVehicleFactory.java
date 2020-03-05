package com.garry.abstractFactory;

// 简单工厂
public class SimpleVehicleFactory {
    public Broom newBroom(){
        return new Broom();
    }
    public Car newCar(){
        return new Car();
    }
}
