package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A01_MyMap {
    public static void main(String[] args) {
        /*
        *
        *
        * V  put(K key,V value)     添加元素
        * V  remove(Object key)
        * void clear  
        * boolean containsKey(Object key)
        * boolean containsValue(Object value)
        * boolean isEmpty()
        * int size()
        *
        *
        *
        *
        * */


        //1.创建map集合对象
        Map<String,String> map = new HashMap<>();
        //2. 添加元素
        map.put("郭靖","黄蓉");
        map.put("韦小宝","沐剑屏");
        map.put("尹志平","小龙龙");

        //3. 打印集合
        System.out.println(map);

        String value = map.put("韦小宝","双儿");
        System.out.println(value);

        map.remove("郭靖");
        System.out.println(map);


        boolean b = map.containsKey("郭靖");
        System.out.println(b);
    }
}
