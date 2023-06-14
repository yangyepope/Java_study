package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

public class A04_Test {
    public static void main(String[] args) {
        /*
         *需求：
         * 定义一个Map集合，键表示省份名称province，值表示市city，但是市有多个
         *添加完毕后，遍历结果格式如下：
         *   江苏省 = 南京市，扬州市，无锡市，常州市
         *   湖北省 = 武汉市，孝感市，十堰市，宜昌市
         *   河北省 = 石家庄市，唐山市，邢台市，保定市
         *
         *
         */

        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();

        Collections.addAll(arrayList1, "南京市", "扬州市", "无锡市", "常州市");
        Collections.addAll(arrayList2, "武汉市", "孝感市", "十堰市", "宜昌市");
        Collections.addAll(arrayList3, "石家庄市", "唐山市", "邢台市", "保定市");

        hashMap.put("江苏省", arrayList1);
        hashMap.put("湖北省", arrayList2);
        hashMap.put("河北省", arrayList3);

//        System.out.println(hashMap);

        Set<Map.Entry<String, ArrayList<String>>> entries = hashMap.entrySet();

        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            StringJoiner stringJoiner = new StringJoiner(",", "", "");
            String key = entry.getKey();
            ArrayList<String> value = entry.getValue();
//            System.out.println(key);
//            System.out.println(value);
            for (String s : value) {
                stringJoiner.add(s);
//                System.out.println(stringJoiner);
            }
            System.out.println(key + " = " + stringJoiner);
        }
    }
}
