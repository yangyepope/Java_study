package com.itheima.test;

public class test2 {
    public static void main(String[] args) {
        // 1.定义变量记录山峰高度
        double heigth = 8844430;
        // 2.定义变量记录纸张厚度
        double paper = 0.1;
        // 3.定义一个变量用来统计次数
        int count = 0;
        while (paper < heigth){
            paper = paper * 2;
            count++;


        }
        System.out.println(count);


    }
}
