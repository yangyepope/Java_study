package com.itheima.mystream;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyStream03 {
    public static void main(String[] args) {

        /*
        * 双列集合
        * */
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("name",111);
        hashMap.put("age",112);
        hashMap.put("sex",113);
        hashMap.put("add",114);
        Set<String> keys = hashMap.keySet();
        keys.stream().forEach(s -> System.out.println(s));

        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        entries.stream().forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry));


    }
}
