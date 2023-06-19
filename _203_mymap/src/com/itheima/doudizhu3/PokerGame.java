package com.itheima.doudizhu3;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {

    //1.准备牌
    //牌盒
    static ArrayList<String> arrayList = new ArrayList<>();

    //创建一个集合用来添加牌的价值
    static HashMap<String, Integer> hashMap = new HashMap<>();

    static {
        String[] colors = {"♠", "♣", "♥", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        for (String color : colors) {
            for (String number : numbers) {
                arrayList.add(color + number);
            }
        }
        arrayList.add(" 小王");
        arrayList.add(" 大王");

        //指定牌的价值
        //牌上的数字到Map集合中判断是否存在
        //存在获取价值
        //不存在，本身的数字就是价值
        hashMap.put("J", 11);
        hashMap.put("Q", 12);
        hashMap.put("K", 13);
        hashMap.put("A", 14);
        hashMap.put("2", 15);
        hashMap.put("小王", 50);
        hashMap.put("大王", 100);


    }


    public PokerGame() {
        //2.洗牌
        Collections.shuffle(arrayList);

        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //3.发牌
        for (int i = 0; i < arrayList.size(); i++) {
            String poker = arrayList.get(i);
            if (i <= 2) {
                lord.add(poker);
                continue;
            } else if (i % 3 == 0) {
                player1.add(poker);
            } else if (i % 3 == 1) {
                player2.add(poker);
            } else {
                player3.add(poker);
            }
        }
        order(lord);
        order(player1);
        order(player2);
        order(player3);
        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);

    }



    //利用牌的价值排序
    public void order(ArrayList<String> arrayList) {

        Collections.sort(arrayList, new Comparator<String>() {
            //Array.sort (插入排序 + 二分查找)
            @Override
            public int compare(String o1, String o2) {
                //o1表示当前要插入到序列中的牌
                //o2表示已经在有序序列中的牌
                int value1 = getValue(o1);
                int value2 = getValue(o2);
                String color1 = o1.substring(0, 1);
                String color2 = o2.substring(0, 1);
                int i = value1 - value2;
                return i == 0 ? color1.compareTo(color2): i;


            }
        });


    }

    public int getValue(String poker) {
        String number = poker.substring(1);
        //判断是否存在于map中，存在获取价值
        if (hashMap.containsKey(number)) {
            return hashMap.get(number);
            //不存在直接转换
        } else {
            return Integer.valueOf(number);
        }
    }


}


