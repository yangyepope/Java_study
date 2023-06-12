package com.itheima.a01mymap;

import java.util.Comparator;
import java.util.TreeMap;

public class A08_TreeMap {
    public static void main(String[] args) {

        /*
        * 键：整数表示id
        * 值：字符串表示商品名称
        * 要求1：按照id的升序排列
        * 要求2：按照id的降序排列
        *

        *
        *
        *
        * */

        // Integer Double 默认情况是按照升序排列
        // String 按照字母在ASCII表中对应的数字升序排列


        TreeMap<Integer,String> treeMap = new TreeMap<>();
        TreeMap<Integer,String> treeMap1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:当前要添加的元素
                //o2:表示已经在红黑树中存在的元素
                return o2 -o1;
            }
        });



        treeMap1.put(1,"可口可乐");
        treeMap1.put(2,"雪碧");
        treeMap1.put(3,"六个核桃");
        treeMap1.put(4,"康师傅");
        treeMap1.put(5,"奥利奥");


        System.out.println(treeMap1);
    }
}
