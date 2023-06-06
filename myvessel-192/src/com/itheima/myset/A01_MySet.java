package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_MySet {

    public A01_MySet() {
    }

    public static void main(String[] args) {
        /*
        * 利用Set系列的集合添加字符串，并使用多种方法遍历
        * 迭代器
        * 增强for
        * Lambda表达式
        * */


        Set<String> set = new HashSet<>();
        // true
        boolean b1 = set.add("张三");

        //false
        boolean b2 = set.add("张三");

        // true
        boolean b3 = set.add("李四");

        // true
        boolean b4 = set.add("王五");
        System.out.println(set);

        // 迭代器

        System.out.println("==========================================================");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("==========================================================");

        //增强for
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("==========================================================");

        // Lambda表达式
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==========================================================");
        //简写形式
        set.forEach(s -> System.out.println(s));

    }
}
