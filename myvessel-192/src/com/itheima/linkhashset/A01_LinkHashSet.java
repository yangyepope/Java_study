package com.itheima.linkhashset;

import com.itheima.myset.Student;

import java.util.LinkedHashSet;

public class A01_LinkHashSet {
    public static void main(String[] args) {

        /*
        * LinkHashSet底层原理
        * 1. 有序、不重复、无索引
        * 2. 这里的有序指的是保证存储和去除的元素顺序一致
        * 3. 原理：底层数据结构依然是哈希表，只是，每个元素又额外的多了一个双链表的机制记录存储的顺序
        *
        *
        * */

        LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();

        Student student1 = new Student("zhangshan",23);
        Student student2 = new Student("lisi",24);
        Student student3 = new Student("wangwu",25);
        Student student4 = new Student("zhangshan",23);

        linkedHashSet.add(student1);
        linkedHashSet.add(student2);
        linkedHashSet.add(student3);
        linkedHashSet.add(student4);

        System.out.println(linkedHashSet);
    }
}
