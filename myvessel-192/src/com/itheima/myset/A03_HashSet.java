package com.itheima.myset;

import java.util.HashSet;

public class A03_HashSet {
    public static void main(String[] args) {


        Student student1 = new Student("zhangshan",23);
        Student student2 = new Student("lisi",24);
        Student student3 = new Student("wangwu",25);
        Student student4 = new Student("zhangshan",23);

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);
        hashSet.add(student4);

        System.out.println(hashSet);

        System.out.println(hashSet.getClass());



    }
}
