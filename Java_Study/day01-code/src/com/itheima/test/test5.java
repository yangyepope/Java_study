package com.itheima.test;

public class test5 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            if (i==3){
                continue;
            }
            System.out.println("小老虎正在吃第" + i +"个包子");
        }
    }
}
