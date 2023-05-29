package com.itheima.a01morphismdemo2;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(this.getAge() + "岁的" + getColor() + "颜色的🐕两只前腿四四的抱着" + something +"猛吃");
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
}
