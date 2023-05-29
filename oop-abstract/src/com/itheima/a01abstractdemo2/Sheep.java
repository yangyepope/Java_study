package com.itheima.a01abstractdemo2;

public class Sheep extends Animal{
    @Override
    public void eat() {
        System.out.println(this.getAge() +"岁的山羊吃艹");
    }

    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }
}
