package com.itheima.a02integerdemo;

import java.util.Scanner;

public class A04_IntegerdDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        /*int i = scanner.nextInt();
        System.out.println(i);
        */

        String line = scanner.nextLine();
        System.out.println(line);

        double d = Double.parseDouble(line);
        System.out.println(d);

    }
}
