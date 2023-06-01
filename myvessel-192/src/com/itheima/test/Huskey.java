package com.itheima.test;

public class Huskey extends Dog{

    public Huskey(){}

    public Huskey(String name,int age){

    }


    @Override
    public void eat() {
        System.out.println("一只叫做" +getName() + "的，" + getAge() + "岁的哈士奇，正在吃狗粮");

    }
}
