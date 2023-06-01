package com.itheima.myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A01_Set {

    public static void main(String[] args) {
        /*
        * 利用Set系列的集合，添加字符串，并使用多种方式遍历
        *
        * 1、 迭代器
        * 2、 增强for
        * 3、 Lambda表达式
        *
        * */

        Set<String> set = new HashSet<>();

        //添加元素
        boolean b = set.add("张三");
        boolean b1 = set.add("张三");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhapliu");

        System.out.println(b);
        System.out.println(b1);
        System.out.println(set);

        System.out.println("===================================================");

        //迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }


        System.out.println("===================================================");
        //增强for
        for (String s : set) {
            System.out.println(s);
        }


        System.out.println("===================================================");
        //Lambda表达式
        set.forEach(s -> System.out.println(s));
    }
}
