package com.itheima.a01oopextendsdemo5;

public class Student {
    String name;
    int age;
    String school;

    public Student() {

        this(null,0,"传志大学");
    }


    public Student(String name, int age, String school) {
        super();
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
