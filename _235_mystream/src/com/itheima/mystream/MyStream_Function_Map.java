package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class MyStream_Function_Map {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList, "张无忌-25", "周星驰-60", "张三风-50", "张良-46", "周子然-28", "赵敏-30", "金毛狮王-40");

        arrayList.stream().map(new Function<String, Object>() {
            @Override
            public Object apply(String s) {
                String[] split = s.split("-");
                String s1 = split[1];
                return Integer.parseInt(s1);
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("========================================");

        arrayList.stream().map(s -> Integer.parseInt(s.split("-")[1])).forEach(s -> System.out.println(s));
    }
}
