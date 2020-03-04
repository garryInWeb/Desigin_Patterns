package com.garry.strategy;

public class Cat {
    public int height;
    public int weight;

    public Cat(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
