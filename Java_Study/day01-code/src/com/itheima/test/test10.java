package com.itheima.test;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Random rd = new Random();
        int number = rd.nextInt(100);

        while (true){
            //int number = rd.nextInt(100);

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个数：");
            int s = sc.nextInt();
            if (s < number){
                System.out.println("小了");
            }else if (s > number){
                System.out.println("大了");
            }else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
