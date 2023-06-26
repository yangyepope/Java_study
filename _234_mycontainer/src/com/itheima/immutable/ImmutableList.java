package com.itheima.immutable;

import java.util.Iterator;
import java.util.List;

public class ImmutableList {

    public static void main(String[] args) {
        //创建不可变集合

        //一旦创建完毕之后，是无法是无法进行修改的，在下面的代码中，只能进行查询操作
        List<String> list = List.of("张三","李四","王五","赵六");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));


        //直接报错，UnsupportedOperationException
//        list.remove("赵六");

        //直接报错
        list.add("钱七");

        //增强for
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------");

        //迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }


        System.out.println("---------------------------------------");

    }
}
