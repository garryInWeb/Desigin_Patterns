package com.garry.abstractFactory;

public class MordenFactory extends AbstractFactory {
    @Override
    People createPeople() {
        return new Person();
    }

    @Override
    Vehicle vehicle() {
        return new Car();
    }
}
