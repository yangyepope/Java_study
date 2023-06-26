package com.itheima.immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableMap {
    /*
     * 创建map的不可变集合
     * "zhangsan"，"nanjing","lisi","beijing","wangwu","tianjin"
     * 注意点：
     * 一：键是不可重复的
     * 二：map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
     * 三：当键值对大于10时，使用ofEntries方法
     * */
    public static void main(String[] args) {
        Map<String, String> map = Map.of("zhangsan", "nanjing", "lisi", "beijing", "wangwu", "tianjin");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("----------------------------------------------------");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
