package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A03_Test {
    public static void main(String[] args) {

        /*
         *
         * 班级里有五个学生
         * 要求：
         * 被点到的学生不会再被点到
         * 但是如果班级里的所有学生都点完了，需要重新开启第二轮点名
         * */


        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        Collections.addAll(arrayList, "范闲", "范健", "范彤", "杜子腾", "杜奇岩", "松禾凡", "侯龙腾", "朱逸群", "杜琪艳", "袁明媛", "李猜", "田咪咪");

        Random random = new Random();


        int count = arrayList.size();

        for (int i = 1; i < 11; i++) {
            System.out.println("====================================第" + i + "轮点名========================================");
            for (int j = 0; j < count; j++) {
                int index = random.nextInt(arrayList.size());
                String name = arrayList.get(index);
                arrayList.remove(name);

                System.out.println(name);
                arrayList1.add(name);

            }
            arrayList.addAll(arrayList1);
            arrayList1.clear();
        }
    }
}
