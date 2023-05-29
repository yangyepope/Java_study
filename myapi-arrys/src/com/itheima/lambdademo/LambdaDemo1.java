package com.itheima.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo1 {

    public static void main(String[] args) {

        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        //匿名内部类写法
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //匿名内部类使用lambda表达式写法
        /*
          Lambda表达式的注意点：
          1. Lambda表达式可以用来简化匿名内部类的书写
          2. Lambda表达式只能简化函数式接口的匿名内部类的写法
          3. 函数式接口：
             有且只有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterace注解
        */
        Arrays.sort(arr, (Integer o1, Integer o2)
                        -> {
                    return o2 - o1;
                }
        );
        System.out.println(Arrays.toString(arr));

    }

    public static void method(Swim1 s){
        s.swimming();
    }
}


@FunctionalInterface
interface Swim1{
    public abstract void swimming();
}
