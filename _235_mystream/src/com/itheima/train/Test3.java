package com.itheima.train;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        Collections.addAll(arrayList,"赵丽颖,33","刘菲,31","杨岚,40","范冰冰,39","赵雅芝,65","杨琪,47");
        Collections.addAll(arrayList1,"冯绍峰,33","成龙,31","谢霆锋,40","刘德华,39","郭富城,65","周杰伦,47");

        Stream<String> stream1 = arrayList1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);

        Stream<String> stream2 = arrayList.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);

        List<Actor> list = Stream.concat(stream1, stream2).map(new Function<String, Actor>() {
            @Override
            public Actor apply(String s) {
                String name = s.split(",")[0];
                int age = Integer.parseInt(s.split(",")[1]);
                return new Actor(name, age);
            }
        }).collect(Collectors.toList());

        System.out.println(list);


    }
}
