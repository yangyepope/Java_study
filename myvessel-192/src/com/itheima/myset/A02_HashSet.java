package com.itheima.myset;

public class A02_HashSet {
    public static void main(String[] args) {


        /*
        *
        * 哈希值：
        * 对象的整数表现形式
        * 1. 如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
        * 2. 如果已经重写hashCode方法，不同对象只要属性相同，计算出的哈希值也是一样的
        * 3. 但是小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能是相同的  （哈希碰撞）
        *
        *
        * */


        Student s1 = new Student("zhangshan",23);
        Student s2 = new Student("zhangshan",23);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());
    }
}
