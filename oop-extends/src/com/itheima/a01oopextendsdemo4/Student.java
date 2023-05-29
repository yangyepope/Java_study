package com.itheima.a01oopextendsdemo4;

public class Student extends Person{
    public Student(String name,int age) {
        super(name,age);
        System.out.println("子类的无参构造");
    }
}
