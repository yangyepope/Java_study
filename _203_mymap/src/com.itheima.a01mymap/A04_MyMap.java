package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MyMap {
    public static void main(String[] args) {
        //map集合的第三种遍历

        Map<String, String> map = new HashMap<>();

        //添加元素
        map.put("鲁迅", "这句话是我说的");
        map.put("曹操", "不可能绝对不可能");
        map.put("刘备", "接着奏乐接着舞");
        map.put("柯镇恶", "看我眼神行事");

        //使用lambda表达式遍历

        map.forEach((String key, String value) -> {
                    System.out.println(key + "=" + value);
                }
        );
    }
}
