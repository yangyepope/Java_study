package com.itheima.a01mymap;

import java.security.Key;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MyMap {

    public static void main(String[] args) {

        /*
        * map集合的第一种遍历
        * */


        Map<String, String> map = new HashMap<>();

        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");
        map.put("欧阳克", "欧阳锋");


        //获取所有的键，并将这些键放到单列集合
        Set<String> keys = map.keySet();
        //增强for
        for (String key : keys) {
//            System.out.println(key);
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }

        //Lambda
        System.out.println("=============================================");
        keys.forEach((String key) -> {
                String value = map.get(key);
                System.out.println(key + "=" + value);
            }
        );

        System.out.println("=============================================");


        //迭代器
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
