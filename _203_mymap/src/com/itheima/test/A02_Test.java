package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A02_Test {
    public static void main(String[] args) {


        /*班级有N个学生
         * 要求：
         * 70%的概率随机到的男生
         * 30%的概率随机到的女生
         *
         * "范闲","范健","范彤","杜子腾","杜奇岩","松禾凡","侯龙腾","朱逸群"
         * "杜琪艳","袁明媛","李猜","田咪咪"
         * */

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Collections.shuffle(arrayList);

        Random random = new Random();
        int index = random.nextInt(arrayList.size());

        int number = arrayList.get(index);

        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList, "范闲", "范健", "范彤", "杜子腾", "杜奇岩", "松禾凡", "侯龙腾", "朱逸群");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "杜琪艳", "袁明媛", "李猜", "田咪咪");

        for (int i = 0; i < 10; i++) {
            if (number == 1) {
                int boyIndex = random.nextInt(boyList.size());
                String name = boyList.get(boyIndex);
                System.out.println(name);
            } else {
                int girlIndex = random.nextInt(girlList.size());
                String name = girlList.get(girlIndex);
                System.out.println(name);
            }
        }


    }
}
