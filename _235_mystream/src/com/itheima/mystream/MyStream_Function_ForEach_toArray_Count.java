package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class MyStream_Function_ForEach_toArray_Count {
    public static void main(String[] args) {
        /*
        Stream流终结方法
        * void forEach(Consumer action)  遍历
        * long count()                   统计
        * toArray()                      收集数据流中的数据放到数组中
        * */


        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"张无忌-17","赵敏-16","周日若-44");

        // forEach
        arrayList.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("------------------------------------");
        // Lambda表达式
        arrayList.stream().forEach(s -> System.out.println(s));

        // count
        long count = arrayList.stream().count();
        System.out.println(count);

        //toArray
        String[] arr = arrayList.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        //Lambda表达式
        String[] arr1 = arrayList.stream().toArray(value -> new String[value]);
        String s = Arrays.toString(arr1);
        System.out.println(s);
    }
}
