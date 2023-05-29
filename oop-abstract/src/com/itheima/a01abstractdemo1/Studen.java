package com.itheima.a01abstractdemo1;

public class Studen extends Person {

    @Override
    public void work() {
        System.out.println("学习");
    }

    public Studen() {
    }

    public Studen(String name, int age) {
        super(name, age);
    }
}
