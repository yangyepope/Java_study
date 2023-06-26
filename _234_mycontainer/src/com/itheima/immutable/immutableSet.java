package com.itheima.immutable;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class immutableSet {
    public static void main(String[] args) {
        /*
        * 创建不可变set集合
        *
        * */

        Set<String> set = Set.of("张三","李四","王五","赵六");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("---------------------------------------");

        //Lambda表达式
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
