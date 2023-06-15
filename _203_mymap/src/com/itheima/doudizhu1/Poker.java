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
//                Collections.addAll(lord, poker);
                lord.add(poker);
                continue;
            } else if (i % 3 == 0) {
//                Collections.addAll(player1,poker);
                player1.add(poker);
            } else if (i % 3 == 1) {
//                Collections.addAll(player2,poker);
                player2.add(poker);
            }else {
//                Collections.addAll(player3,poker);
                player3.add(poker);
            }
        }
        System.out.println("地主" + lord);
        System.out.println("盼盼的牌" + player1);
        System.out.println("锋哥的牌" + player2);
        System.out.println("政哥的牌" + player3);

    }

}
