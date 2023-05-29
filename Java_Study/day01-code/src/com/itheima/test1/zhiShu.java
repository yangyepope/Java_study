package com.itheima.test1;

public class zhiShu {
    public static void main(String[] args) {



        int count = 0;
        // 1.先判断1-100内某一个数是否为质数
        for (int i = 101; i <200 ; i++) {

            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j ==0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i + "是一个质数");
                count++;
            }

        }
        System.out.println(count);

        /*int i = 131;
        boolean flag = true;
        for (int j = 2; j < i; j++) {
            if (i % j ==0){
                 flag = false;
                 break;
            }
        }
        if (flag){
            System.out.println(i + "是一个质数");
        }else {
            System.out.println(i + "不是一个质数");
        } */
    }
}
