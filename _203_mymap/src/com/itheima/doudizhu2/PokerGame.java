package com.itheima.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {


    //1.准备牌
    static ArrayList<Integer> arrayList = new ArrayList<>();
    static HashMap<Integer, String> hashMap = new HashMap<>();

    static {
        String[] colors = {"♠", "♣", "♥", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int seriesNo = 1;
        for (int i = 0; i < numbers.length; i++) {
            String number = numbers[i];
            for (int j = 0; j < colors.length; j++) {
                String color = colors[j];
                String poker = color + number;
                hashMap.put(seriesNo, poker);
                arrayList.add(seriesNo);
                seriesNo++;
            }
        }
        hashMap.put(seriesNo, "小王");
        arrayList.add(seriesNo);
        seriesNo++;
        hashMap.put(seriesNo, "大王");
        arrayList.add(seriesNo);
//        System.out.print(arrayList);
//        System.out.println(hashMap);

    }

    public PokerGame() {
        // 2.洗牌
        Collections.shuffle(arrayList);

        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        // 3.发牌
        for (int i = 0; i < arrayList.size(); i++) {
            if (i <= 2) {
                int index = arrayList.get(i);
                lord.add(index);
                continue;
            } else if (i % 3 == 0) {
                player1.add(arrayList.get(i));
            } else if (i % 3 == 1) {
                player2.add(arrayList.get(i));
            } else {
                player3.add(arrayList.get(i));
            }

        }

        lookPoker("底牌", lord);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    public void lookPoker(String name, TreeSet<Integer> treeSet) {
        System.out.print(name + ":");
        for (int seriesNo : treeSet) {
            String poker = hashMap.get(seriesNo);
            System.out.print(poker);
        }
        System.out.println();
    }
}
