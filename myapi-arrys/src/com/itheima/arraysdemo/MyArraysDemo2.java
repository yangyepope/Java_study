package com.itheima.arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {

        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        //匿名内部类写法
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        System.out.println(Arrays.toString(arr));

 /*       Comper comper = new Comper();

        Arrays.sort(arr,comper);

        System.out.println(Arrays.toString(arr));*/
    }
}
