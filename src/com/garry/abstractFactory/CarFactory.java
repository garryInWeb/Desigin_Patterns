package com.garry.abstractFactory;

public class CarFactory implements MoveableFactory {
    @Override
    public Moveable createMoveable() {
        return new Car();
    }
}
