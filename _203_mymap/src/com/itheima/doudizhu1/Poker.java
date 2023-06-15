package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Poker {

    static ArrayList<String> arrayList = new ArrayList<>();

    static {

        //1.准备牌
        String[] colors = {"♠", "♣", "♥", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

//        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            for (int j = 0; j < numbers.length; j++) {
                String number = numbers[j];
                String poker = color + number;
                Collections.addAll(arrayList, poker);
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");
//        System.out.print(arrayList);
    }

    public Poker() {

        // 2.洗牌
        Collections.shuffle(arrayList);

        System.out.print(arrayList);
        System.out.println();


        // 3.发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

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

        lookPoker("底牌",lord);
        lookPoker("盼盼",player1);
        lookPoker("锋哥",player2);
        lookPoker("政哥",player3);


    }

    public void lookPoker(String name, ArrayList<String> arrayList) {
        System.out.print(name + ":");
        for (String poker : arrayList) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}
