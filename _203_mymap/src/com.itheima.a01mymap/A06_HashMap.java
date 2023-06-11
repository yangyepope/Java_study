package com.itheima.a01mymap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class A06_HashMap {
    public static void main(String[] args) {
        /*
        *某个班级80名学生，现在需要组成秋游活动
        *班长提供了四个景点的依次是（A、B、C、D）
        *每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多
        *
        * */
        String[] list = {"A","B","C","D"};

        ArrayList<String> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(list.length);
            String s = list[index];
            arrayList.add(s);
        }
        System.out.println(arrayList);
        System.out.println("-------------------------------------------------------------------------------------");

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String s : arrayList) {
            if (hashMap.containsKey(s)){
                int count = hashMap.get(s);
                count++;
                hashMap.put(s,count);
            }else {
                hashMap.put(s,1);
            }
        }
        System.out.println(hashMap);

    }
}
