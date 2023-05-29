package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        /*
        猴吃桃
        */

        System.out.println(totalPeat(10));
    }

    private static int totalPeat(int day) {

        if (day == 1) {
            return 1;
        } else {
            return (totalPeat(day - 1) + 1) * 2;
        }
    }
}
