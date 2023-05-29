package com.itheima.a05regexdemo;

public class RegexDemo6 {
    public static void main(String[] args) {
        /*
         *  需求一：  我要学学学学编编编编编程程程程程程程程
         */

        String s = "我要学学学学编编编编编程程程程程程程程";
//        String regex = "(.)\\1?";
        String result = s.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
