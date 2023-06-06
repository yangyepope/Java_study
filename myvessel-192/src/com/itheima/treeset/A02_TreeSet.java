package com.itheima.treeset;

import java.util.TreeSet;

public class A02_TreeSet {
    public static void main(String[] args) {

        /*
        * 要求按照学生的年龄进行排序，同姓名，同年龄可以认为是同一个人
        *
        * 方式一：
        *    默认的排序规则/自然排序
        *    Student实现Comparable接口，重写里面的抽象方法，再指定比较规则
        *
        * */

        TreeSet<Student> treeSet = new TreeSet<>();

        Student student1 = new Student("zhangsan",23);
        Student student2 = new Student("lisi",21);
        Student student3 = new Student("wangwu",25);
        Student student4 = new Student("zhangsan",23);

        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);


        System.out.println(treeSet);
    }
}
