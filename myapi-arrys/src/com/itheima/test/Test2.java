package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {

        /*
        不死神兔
        */

        //解法一：
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[11]);


        //解法二：
        /*
        使用递归的方式去做
        1. 递归的出口
        2. 递归的规律
        Fn(12) = Fn(11) + Fn(10);
        */
        System.out.println(getSum(12));

    }

    public static int getSum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return getSum(month - 1) + getSum(month - 2);
        }
    }
}
