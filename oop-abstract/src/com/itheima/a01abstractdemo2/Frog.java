package com.itheima.a01abstractdemo2;

public class Frog extends Animal{

    @Override
    public void eat() {
        System.out.println(this.getAge() +"岁的青蛙吃虫子");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
