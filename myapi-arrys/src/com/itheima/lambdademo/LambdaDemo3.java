package com.itheima.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {


        String[] arr = {"a", "aaa", "aaaa", "aa"};
        // 给数组排序时，按照指定的方法进行，就需要用到sort

   /* Arrays.sort(arr, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    });*/

        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());

        System.out.println(Arrays.toString(arr));
    }
}
