package com.itheima.arraysdemo;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {

        // toString：将数字变成字符串
        System.out.println("--------------------toString-----------------------");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));


        //binarySearch: 二分查找法查找元素
        System.out.println("--------------------binarySearch-----------------------");
        System.out.println(Arrays.binarySearch(arr, 5));

        //copyOf: 拷贝数组
        System.out.println("--------------------copyOf-----------------------");
        int[] newArray = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArray));


        //copyOfRange: 拷贝数组(指定范围)
        System.out.println("--------------------copyOfRange-----------------------");
        int[] newArray2 = Arrays.copyOfRange(arr, 1, 9);
        System.out.println(Arrays.toString(newArray2));

        //sort：排序
        System.out.println("--------------------sort-----------------------");
        Arrays.sort(arr);


    }
}
