package com.itheima.a02integerdemo;

public class A04_IntegerDemo1 {
    public static void main(String[] args) {
        String s = Integer.toBinaryString(100);
        System.out.println(s);

        String s1 = Integer.toOctalString(100);
        System.out.println(s1);

        String s2 = Integer.toHexString(100);
        System.out.println(s2);


        System.out.println(Integer.parseInt("100"));
    }
}
