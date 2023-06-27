package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class MyStream02 {
    public static void main(String[] args) {
        /*
        * 单列集合 default Stream<E> stream()   Collection中的默认方法
        * 双列集合 无                            无法直接使用stream流
        * 数组     public static<T> Stream<T>  stream(T[]) array    Arrays工具类中的静态方法
        *一堆零散数据  public static<T> Stream<T>  of(T...values)     Stream接口中的静态方法
         *
        * */

        //单列集合stream流
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"aaaa","bbbb","cccc","dddd","eeeee");
        Stream<String> stream = arrayList.stream();
        /*stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //Lambda表达式简写形式
        stream.forEach(s -> System.out.println(s));
    }
}
