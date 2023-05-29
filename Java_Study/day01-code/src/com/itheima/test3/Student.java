package com.itheima.test3;

public class Student {
    private String name;
    private int age;

    //空参构造
    /*public Student(){
        System.out.println("看看我调用了没有");
    }
    */

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
       this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(){
        this.age = age;
    }

}
