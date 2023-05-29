package com.itheima.arraylist;

public class Student {
    //1.私有成员变量
    private String name;
    private int age;

    //2.带空参构造

    public Student() {
    }


    //2.实参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
