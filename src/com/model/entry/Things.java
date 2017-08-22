package com.model.entry;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;

public class Things {
    Stack<String> stack = new Stack<String>();
    Integer MAX_LENGTH = 10;
    CountDownLatch countDownLatch = new CountDownLatch(MAX_LENGTH);

    public String put(String s ){
        return stack.push(s);
    }
    public String get(){
        return stack.pop();
    }
    public Integer size(){
        return stack.size();
    }
    public static void main(String[] args) {
        Things things = new Things();
        for(int i = 0; i < 10; i++){
            int item = i;
            new Thread( () -> new product(things).put(item + "")).start();
        }
        for(int i = 0; i < 10; i++){
            new Thread( () -> new consumer(things).get()).start();
        }
    }
}

class product{
    Things things;

    public product(Things things){
        this.things = things;
    }
    public String put(String s){
        while(true){
            if(things.size() >= things.MAX_LENGTH)
                try {
                    things.countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(Thread.currentThread().getId() + "put:" + things.put(s));
            things.countDownLatch.countDown();
        }
    }
}
class consumer{
    Things things;
    public consumer(Things things){
        this.things = things;
    }
    public String get(){
        while(true){
            if(things.size() < 1)
                try {
                    things.countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println(Thread.currentThread().getId() + "get:" + things.get());
            things.countDownLatch.countDown();
        }
    }
}