package com.itheima.mysort;

public class A04_RecursionDemo1 {
    public static void main(String[] args) {
        System.out.println(getMul(5));

    }

    /*

    */
    public static int getMul(int number){
        if (number == 1){
            return 1;
        }
        return number * getMul(number - 1);
    }
}
