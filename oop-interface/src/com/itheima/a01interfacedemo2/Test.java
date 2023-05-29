package com.itheima.a01interfacedemo2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println(Inter.a);
//        Inter.a = 20;
        InterImpl ii = new InterImpl();
        ii.method();

        Scanner sc = new Scanner(System.in);
        sc.next();
    }

}
