package com.itheima.treeset;

import java.io.FilterOutputStream;
import java.util.Iterator;
import java.util.TreeSet;

public class A01_TreeSet {
    public static void main(String[] args) {

        /*
        * 需求：利用TreeSet存储整数并进行排序
        *
        * */

        //1. 创建TreeSet集合对象
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(2);

        System.out.println(treeSet);


        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }

        System.out.println("==============================================");

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        System.out.println("==============================================");

        treeSet.forEach(integer -> System.out.println(integer));
    }
}
