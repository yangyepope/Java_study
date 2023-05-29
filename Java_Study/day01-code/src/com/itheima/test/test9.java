package com.itheima.test;

import java.util.Scanner;

// 质数
public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        boolean flag = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0){
                flag = false;
                break;

            }

        }
        if (flag){
            System.out.println(number + "质数");
        }else {
            System.out.println(number + "不是质数");
        }

    }
}
