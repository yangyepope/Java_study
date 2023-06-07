package com.itheima.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class A04_TreeSet_Train {
    public static void main(String[] args) {
        /*
         * 需求：创建五个学生对象
         * 属性：姓名、年龄、语文成绩、数学成绩、英语成绩
         * 按照总分从高到低输出到控制台
         * 如果总分一样，按照语文成绩排序
         * 如果语文成绩一样，按照英语成绩排序
         * 如果英语成绩一样，按照年龄排序
         * 如果年龄一样，按照姓名的字母排序
         * 如果都一样，认为是同一个学生，不存
         *
         *
         * 第一种：默认排序/自然排序
         * 第二种：比较器排序
         *
         *
         * */

        Student1 student1 = new Student1("zhangshan", 23, 90, 99, 50);
        Student1 student2 = new Student1("lisi", 24, 90, 98, 50);
        Student1 student3 = new Student1("wangwu", 25, 95, 100, 30);
        Student1 student4 = new Student1("zhaoliu", 26, 95, 100, 30);
        Student1 student5 = new Student1("qianqi", 26, 70, 80, 70);
        Student1 student6 = new Student1("qianqi", 26, 70, 80, 70);

        TreeSet<Student1> treeSet = new TreeSet<>();
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student5);
        treeSet.add(student6);

        boolean contains = treeSet.contains(student1);
        System.out.println(contains);

        System.out.println(treeSet);
    }
}
