package com.itheima.a01mymap;

import java.util.LinkedHashMap;
import java.util.Set;

public class A07_LinkHashMap {
    public static void main(String[] args) {


        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("a", 123);
        linkedHashMap.put("a", 111);
        linkedHashMap.put("b", 456);
        linkedHashMap.put("c", 789);

        System.out.println(linkedHashMap);

        Set<String> strings = linkedHashMap.keySet();
        for (String string : strings) {
            int value = linkedHashMap.get(string);
            System.out.println(string + "=" + value);
        }
    }
}
