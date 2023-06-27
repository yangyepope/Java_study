package com.itheima.mystream;

import java.sql.Array;
import java.util.Arrays;

public class MyStream04 {
    public static void main(String[] args) {
        /*
         *数组stream流
         * */
//        Arrays[] arrays = new Arrays[10];
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        String[] arr2 = {"a", "b", "c", "d"};
        Arrays.stream(arr2).forEach(s -> System.out.println(s));
    }

}
