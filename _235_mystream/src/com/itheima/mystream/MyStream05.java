package com.itheima.mystream;

import java.util.stream.Stream;

public class MyStream05 {
    public static void main(String[] args) {
        /*
        * 零散的数据
        *
        *
        * */
        Stream.of(1,2,3,4,5,6).forEach(s-> System.out.println(s));
        System.out.println("----------------------------------------------");
        Stream.of("a","b","c","d","e").forEach(s -> System.out.println(s));
    }
}
