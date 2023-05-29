package com.itheima.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        /*
         * 课堂练习2：定义一个方法利用基本查询，查询某个元素再数组中的索引
         * 需求：需要考虑数组中的元素重复
         *
         * */

        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};

//        ArrayList<Integer> arrayList = [131, 127, 147, 81, 103, 23, 7, 79, 81];
        //集合中放置的数据类型伟Integer

        System.out.println(basicSearch(arr, 81));


    }

    public static ArrayList<Integer> basicSearch(int[] arr,int number){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                arrayList.add(i);
            }
        }
        return arrayList;


    }
}
