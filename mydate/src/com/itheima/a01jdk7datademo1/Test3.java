package com.itheima.a01jdk7datademo1;

public class Test3 {
    public static void main(String[] args) {
        /*
        * 算法水题：
        * 定义一个方法实现toBinaryString方法的效果，将一个十进制整数转成二进制
        *
        *
        *
        * */
        System.out.println(toBinaryString(6));


    }

    public static String toBinaryString(int number){
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            if (number == 0){
                break;
            }
            int reminder = number % 2;
            number = number / 2;
            stringBuilder.insert(0,reminder);
        }
        return stringBuilder.toString();

    }
}
