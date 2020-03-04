package com.garry.strategy;

import java.util.Comparator;

public class Sorter<T> {
    public void sort(T[] list, Comparator<T> comparator){

        for(int i = 0; i < list.length; i++){
            int minPos = i;

            for(int j=i+1; j < list.length; j++){
                minPos = comparator.compare(list[i],list[j]) > 0 ? j : i;
            }
            swap(list,i,minPos);
        }
    }

    private void swap(T[] list,int i, int minPos) {
        T temp = list[i];
        list[i] = list[minPos];
        list[minPos] = temp;
    }
}
