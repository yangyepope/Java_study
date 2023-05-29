package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        // 1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        // 2.创建学生对象
        Student s1 = new Student("张三",25);
        Student s2 = new Student("李四",26);
        Student s3 = new Student("王五",27);

        //3.添加数据
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //4.遍历集合

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + ", " +  stu.getAge());
        }




    }
}
