package com.itheima.test;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        for (int i = 1;i < number;i++){
            if (i*i == number){
                System.out.println(i + "就是" + number + "的平方根");
                //一旦找到就跳出
                break;
            }else if (i*i > number){
                System.out.println((i-1) + "就是" + number + "的平方根整数");
                break;
            }
        }
    }
}
