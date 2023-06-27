package com.itheima.mystream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MyStream05 {
    public static void main(String[] args) {
        /*
         * 零散的数据
         *
         *
         * */

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Arrays.stream(arr1).forEach(s -> System.out.println(s));

        String[] arr2 = {"a", "b", "c", "d"};
        Arrays.stream(arr2).forEach(s -> System.out.println(s));

        Stream.of(1, 2, 3, 4, 5, 6).forEach(s -> System.out.println(s));
        System.out.println("----------------------------------------------");
        Stream.of("a", "b", "c", "d", "e").forEach(s -> System.out.println(s));


        //注意：
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        //但是数组必须是引用数据类型，如果传递基本数据类型，时会把整个数组当作一个元素，放到Stream流中
        Stream.of(arr1).forEach(s -> System.out.println(s)); //[I@7699a589
    }
}
