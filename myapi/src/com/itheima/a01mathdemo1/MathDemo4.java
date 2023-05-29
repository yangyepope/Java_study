package com.itheima.a01mathdemo1;

public class MathDemo4 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            int ge = i % 10;
            int shi = i / 10;
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (sum == i) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
