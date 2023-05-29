package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        System.out.println(getCount(7));
    }

    private static int getCount(int step) {

        if (step == 1) {
            return 1;
        } else if (step == 2) {
            return 2;
        } else {
            return getCount(step - 1) + getCount(step - 2);
        }
    }
}
