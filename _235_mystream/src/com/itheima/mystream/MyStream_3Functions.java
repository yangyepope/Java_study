package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyStream_3Functions {
    public static void main(String[] args) {
        /*
        *
        * filter  过滤
        * limit   获取前几个元素
        * skip    跳过前几个元素
        * */

        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"张无忌","周星驰","张三风","张良","周子然","赵敏","金毛狮王");

        //filter 把张开通的留下，其余数据过滤不要
        arrayList.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

               //如果返回值为false，表示当前数据摈弃不要
               //如果返回true，表示当前数据留下
                return s.startsWith("张");
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //简写形式
        arrayList.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));


        System.out.println("====================================================");
        // limit 获取前几个元素
        arrayList.stream().limit(3).forEach(s -> System.out.println(s));

        System.out.println("====================================================");
        // skip 跳过前几个元素
        arrayList.stream().skip(4).forEach(s -> System.out.println(s));
    }
}
