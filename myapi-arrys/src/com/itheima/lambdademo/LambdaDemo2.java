package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {


        /*

        lambda省略规则：
        1. 参数类型可以不屑
        2. 如果只有一个参数，参数类型可以省略，同时()也可以省略
        3.
        */

        method(
                () -> {
            System.out.println("游泳");
        });

        //lambda表达式省略写法
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        //匿名内部类写法
        Arrays.sort(arr, (o1, o2) ->  o2 - o1);
        System.out.println(Arrays.toString(arr));


    }


    public static void method(Swim s){
        s.swimming();
    }

}

interface Swim{
    public abstract void swimming();
}

