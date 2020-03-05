package com.garry.abstractFactory;

public class Main {

    public static void main(String[] args) {
//        Person person = new Person();
//        AK47 ak47 = new AK47();
//        Car car = new Car();

        //简单工厂
            SimpleVehicleFactory simpleVehicleFactory = new SimpleVehicleFactory();
            Broom broom = simpleVehicleFactory.newBroom();

        //工厂方法 (便于同种类型的横向扩展)
        CarFactory carFactory = new CarFactory();
        Moveable car = carFactory.createMoveable();
        car.go();

        // 抽象工厂
        AbstractFactory factory = new MordenFactory();
        People people = factory.createPeople();
        Vehicle vehicle = factory.vehicle();
    }
}
