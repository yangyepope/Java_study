package com.itheima.test;

public class test7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
            if (i % 10 ==7 || i / 10 %10 == 7 || i % 7 == 0){
                System.out.println("pass");
                continue;
            }
            System.out.println(i);
        }
    }
}
