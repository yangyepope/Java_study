package com.itheima.a01mymap;

import java.util.Comparator;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A10_TreeMap {
    public static void main(String[] args) {

        /*
         * 需求：
         * 字符串"acbdcbcbdbceacbeedbdb"
         * 请统计字符串中每一个字符出现的次数，并按照格式输出
         * 输出结果：
         *    a(5)b(4)c(3)d(2)e(1)
         * 新的统计思想： 利用map集合进行统计
         *          如果题目中没有要求对结果进行排序，默认使用HashMap
         *          如果题目中要求对结果进行排序，请使用Treemap
         *
         *
         *
         * */

        //键：要统计的内容
        //值：表示次数

        TreeMap<String, Integer> treeMap = new TreeMap<>();

        String s = "acbdcbcbdbceacbeedbdb";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (treeMap.containsKey(String.valueOf(c))) {
                int count = treeMap.get(String.valueOf(c));
                count++;
                treeMap.put(String.valueOf(c), count);
            } else {
                treeMap.put(String.valueOf(c), 1);
            }
        }
        System.out.println(treeMap);

        StringBuilder stringBuilder = new StringBuilder();

        treeMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                stringBuilder.append(key).append("(").append(value).append(")");
            }
        });
        System.out.println(stringBuilder);

        StringJoiner stringJoiner = new StringJoiner("", "", "");

        treeMap.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                stringJoiner.add(key + "").add("(").add(value + "").add(")");
            }
        });

        System.out.println(stringJoiner);
    }
}
