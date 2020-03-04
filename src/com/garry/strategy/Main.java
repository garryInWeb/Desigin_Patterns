package com.garry.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = new Cat[]{new Cat(3,3),new Cat(1,1),new Cat(5,5)};

        Sorter<Cat> sorter = new Sorter<>();

//        sorter.sort(cat,(o1,o2) -> {
//            if (o1.height > o2.height) return -1;
//            else if(o1.height < o2.height) return 1;
//            else return 0;
//        });

        sorter.sort(cat,(o1,o2) -> {
            if (o1.weight < o2.weight) return -1;
            else if(o1.weight > o2.weight) return 1;
            else return 0;
        });

        System.out.println(Arrays.toString(cat));
    }
}
