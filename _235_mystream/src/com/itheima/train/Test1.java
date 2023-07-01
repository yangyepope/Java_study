package com.itheima.train;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {


        /*
        * 定义一个集合，并添加整数1,2,3,4,5
        * 过滤奇数，只留下偶数
        * */

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,1,2,3,4,5,6,7,8,9,10);

        List<Integer> list1 = arrayList.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(Collectors.toList());
        System.out.println(list1);
    }
}
