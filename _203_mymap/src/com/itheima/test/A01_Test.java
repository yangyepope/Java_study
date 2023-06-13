package com.itheima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A01_Test {
    public static void main(String[] args) {

        /*
        * 班级里有N个学生，学生属性：姓名，年龄，性别
        * 实现随机点名
        *
        *
        * */

        ArrayList<String> arrayList = new ArrayList<>();

        Collections.addAll(arrayList,"范闲","范健","范彤","杜子腾","杜奇岩","松禾凡","侯龙腾","朱逸群","朱穆朗玛峰","袁铭苑");

        Random random = new Random();
//        int index = random.nextInt(arrayList.size());
//        String s = arrayList.get(index);


        for (int i = 0; i < arrayList.size(); i++) {
            int index = random.nextInt(arrayList.size());
            System.out.println(arrayList.get(index));

            arrayList.remove(arrayList.get(index));
//            System.out.println(arrayList);
            i--;
        }
    }
}
