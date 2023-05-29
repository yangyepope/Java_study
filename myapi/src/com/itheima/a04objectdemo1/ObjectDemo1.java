package com.itheima.a04objectdemo1;

public class ObjectDemo1 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder stringBuilder = new StringBuilder("abc");

        System.out.println(s.equals(stringBuilder));

        System.out.println(stringBuilder.equals(s));
    }
}
