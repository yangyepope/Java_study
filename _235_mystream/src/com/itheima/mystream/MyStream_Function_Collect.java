package com.itheima.mystream;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyStream_Function_Collect {
    public static void main(String[] args) {

        /*
        *
        * collect (Collector collector)         收集流中的数据
        * 注意点：
        *     当数据收集时，简直不能重复
        *
        * */

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"张无忌-男-25", "周星驰-男-60","张三风-男-50", "张良-男-46", "周子然-男-28", "赵敏-女-30", "金毛狮王-男-40");

        //收集到List集合当中
        //需求
        //把所有的男性收集起来
        List<String> newList = arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return "男".equals(s.split("-")[1]);
            }
        }).collect(Collectors.toList());

        System.out.println(newList);

        System.out.println("------------------------------------------------------------------");


        //收集到Set集合当中,Set中会自动进行剔重
        Set<String> newList1 = arrayList.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(newList1);


        System.out.println("------------------------------------------------------------------");
        //收集到Map集合当中
        Map<String, Integer> arrayList2 = arrayList.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                /*
                * toMap:参数一表示键的生成规则
                * toMap:参数二表示值的生成规则
                *
                * 参数一：
                *    Function泛型一：表示流中每一个数据的类型
                *    Function泛型二：表示Map集合中键数据的类型
                * */
                .collect(Collectors.toMap(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.split("-")[0];
            }
        }, new Function<String, Integer>() {
                    /*
                     *参数二：
                     *    Function泛型一：表示流中每一个数据的类型
                     *    Function泛型二：表示Map集合中值的数据类型
                     *
                    *
                    * */
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[2]);
            }
        }));
        System.out.println(arrayList2);


        //简写方式
        Map<String, Integer> collect = arrayList.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors
                        .toMap(s -> s.split("-")[0],
                                s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(collect);

    }
}
