package com.itheima.mygenerics;

import java.util.Arrays;

public class GenericsTest {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();

        myArrayList.add("aaaa");
        myArrayList.add("bbbb");
        myArrayList.add("cccc");

        System.out.println(myArrayList.get(2));

        //去掉数组中的null需要改写toString方法
        System.out.println(myArrayList.toString());
        System.out.println(myArrayList);

        //数组中存Integer

        MyArrayList<Integer> objectMyArrayList = new MyArrayList<>();
        objectMyArrayList.add(123);

    }
}
