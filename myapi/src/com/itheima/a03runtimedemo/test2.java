package com.itheima.a03runtimedemo;

public class test2 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan",23);
        Student student2 = new Student("zhangsan",23);
        boolean flag = student1.equals(student2);
        System.out.println(flag);

    }
}
