package com.itheima.a01mathdemo1;

public class MathDemo1 {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(8));
        System.out.println(Math.cbrt(8));

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random() * 100 + 1));
        }
    }
}
