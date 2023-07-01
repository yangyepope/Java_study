package com.itheima.train;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        /*
         *
         * 创建一个集合
         *
         * */
        // 1.创建集合
        ArrayList<String> arrayList = new ArrayList<>();

        // 2.添加数据
        arrayList.add("zhangsan,23");
        arrayList.add("lisi,24");
        arrayList.add("wangwu,25");

        arrayList.forEach(s -> System.out.println(s));

        // 3.创建Stream流
        Map<String, Integer> collect = arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                String s1 = s.split(",")[1];
                return Integer.parseInt(s1) >= 24;
            }
        }).collect(Collectors
                .toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])));
        System.out.println(collect);
    }
}
