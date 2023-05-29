package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str =sc.next();

        int BigAcc = 0;
        int SmallAcc = 0;
        int NumAcc = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ){
                SmallAcc++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                BigAcc++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                NumAcc++;
            }
        }
        System.out.println("BigAcc:" +  BigAcc);
        System.out.println("SmallAcc:" +  SmallAcc);
        System.out.println("NumAcc:" +  NumAcc);
    }

}
