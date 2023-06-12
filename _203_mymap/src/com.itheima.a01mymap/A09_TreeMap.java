package com.itheima.a01mymap;

import java.util.TreeMap;

public class A09_TreeMap {
    public static void main(String[] args) {

        /*
        *
        * TreeMap集合：基本应用
        * 需求2：
        * 键：学生对象
        * 值：籍贯
        * 要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人
        * */

        TreeMap<Student1,String> treeMap = new TreeMap<>();

        Student1 student1 = new Student1("zhangsan",23);
        Student1 student2 = new Student1("lisi",24);
        Student1 student3 = new Student1("wangwu",25);
        Student1 student4 = new Student1("zhaoliu",26);

        treeMap.put(student1,"天津");
        treeMap.put(student2,"北京");
        treeMap.put(student3,"武汉");
        treeMap.put(student4,"上海");

        System.out.println(treeMap);
    }
}
