package com.itheima.mystream;

import java.util.ArrayList;

public class MyStream01 {
    public static void main(String[] args) {

        /*
         * 创建集合添加元素，完成如下需求
         *1.把所有以张开头的元素存储到新集合中
         *2.把张开头的，长度为3的元素再存储到新集合中
         *3.变量打印最终结果
         * */

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("张无忌");
        arrayList.add("张自若");
        arrayList.add("张强");
        arrayList.add("赵敏");
        arrayList.add("张三丰");

        //把所有以张开头的元素存储到新集合中
        ArrayList<String> arrayList1 = new ArrayList<>();
        for (String name : arrayList) {
            if (name.startsWith("张")) {
                arrayList1.add(name);
            }
        }

        System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        //把张开头的，长度为3的元素再存储到新集合中
        for (String name : arrayList1) {
            if (name.length() == 3) {
                arrayList2.add(name);
            }
        }
        System.out.println(arrayList2);

        //使用stream流进行处理
        arrayList.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(s -> System.out.println(s));
    }
}
