package com.itheima.a01interfacedemo1;

public class Rabbit extends Animal{

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.getAge() + ", " + this.getName());
    }
}
