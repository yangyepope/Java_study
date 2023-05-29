package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student();
        stu1.setName("zhangshan");
        stu1.setAge(23);
        stu1.setGender("男");

        Student stu2 = new Student();
        stu2.setName("lisi");
        stu2.setAge(24);
        stu2.setGender("女");

        Student stu3 = new Student();
        stu3.setName("wangwu");
        stu3.setAge(25);
        stu3.setGender("男");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);


    }
}
