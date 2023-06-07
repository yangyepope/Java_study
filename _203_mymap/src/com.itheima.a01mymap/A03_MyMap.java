package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MyMap {
    public static void main(String[] args) {
        /*
         *map集合的第二种遍历
         *
         *
         * */

        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("欧阳克", "欧阳锋");

        //通过一个方法获取所有的键值对对象，返回一个Set集合
        //增强for
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("==========================================");

        //迭代器
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("==========================================");

        // Lambda表达式
        entries.forEach((Map.Entry<String, String> stringStringEntry) -> {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println(key + "=" + value);
        });

    }
}
