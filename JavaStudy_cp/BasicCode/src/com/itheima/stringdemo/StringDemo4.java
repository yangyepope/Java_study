package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {

        for (int i= 0;i < 3;i++) {
            String account = "username";
            String passwd = "123456";
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String account1 = sc.next();
            System.out.println("请输入密码");
            String passwd1 = sc.next();

            if (account.equals(account1) || passwd.equals(passwd1)){
                System.out.println("用户密码输入正确");
                break;
            }else {
                if (i <2){
                    System.out.println("用户密码输入不正确");
                }else {
                    System.out.println("用户密码输入不正确");
                    break;
                }
            }
        }
    }
}
