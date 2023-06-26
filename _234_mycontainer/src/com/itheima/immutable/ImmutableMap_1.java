package com.itheima.immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableMap_1 {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("zhangsan","wuhan");
        hashMap.put("lisi","tianmen");
        hashMap.put("wangwu","xianning");
        hashMap.put("zhaoliu","xiangfan");
        hashMap.put("qianqi","beijing");
        hashMap.put("zhangsan1","wuhan1");
        hashMap.put("zhangsan2","wuhan2");
        hashMap.put("zhangsan3","wuhan3");
        hashMap.put("zhangsan4","wuhan4");
        hashMap.put("zhangsan5","wuhan5");
        hashMap.put("zhangsan6","wuhan6");
        hashMap.put("zhangsan7","wuhan7");
        hashMap.put("zhangsan8","wuhan8");


        //方法一
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        System.out.println(entries);

        Map.Entry[] arr1 = entries.toArray(new Map.Entry[0]);
        System.out.println("---------------");
        System.out.println(arr1);
        for (Map.Entry entry : arr1) {
            System.out.println(entry);
        }

        Map map = Map.ofEntries(arr1);

        //方法二
        Map.ofEntries(hashMap.entrySet().toArray(new Map.Entry[0]));

        //方法三
        Map<String, String> stringStringMap = Map.copyOf(hashMap);
        System.out.println(stringStringMap);



    }
}

