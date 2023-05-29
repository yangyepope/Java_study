package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个金额");
        int money = sc.nextInt();
        String capMoney = "";
        while (true){
            if (money >= 0 && money <= 999999){
                capMoney =capMoney + getCapitalnumber(money % 10);
                money = money / 10;
//                System.out.println(money);
                if (money == 0){
                   break;
                }
            }else {
                System.out.println("输入的金额非法");
                break;
            }
        }
        System.out.println(capMoney);
        System.out.println(reverser(capMoney));

    }




    public static String getCapitalnumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        return arr[number];
    }

    public static String reverser(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result +  str.charAt(i);
        }
        return result;
    }
}
