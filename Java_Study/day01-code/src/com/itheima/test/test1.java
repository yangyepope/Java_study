package com.itheima.test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //键盘录入三位数
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number /10 %10;
        int bai = number /100 %10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }
}
