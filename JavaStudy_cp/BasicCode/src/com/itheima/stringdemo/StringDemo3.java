package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s1 = sc.next();

        String s2 = "abc";
        System.out.println(s1 == s2);

    }
}
