package com.itheima.a01morphismdemo1;

public class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("admin的信息为" + getName() + "," + getAge() );
    }
}
