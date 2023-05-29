package com.itheima.a01jdk7datademo1;

public class Test2 {
    public static void main(String[] args) {
        /*
         * 自己显示parseInt的效果
         *
         *
         * */

        String str = "123";
        if (!str.matches("[1-9]\\d{0,10}")) {
            System.out.println("数据格式有误");
        } else {
            int num = 0;

            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                num = num * 10 + c;
            }
            System.out.println(num);


        }


    }

}

