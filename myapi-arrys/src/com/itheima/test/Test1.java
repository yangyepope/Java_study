package com.itheima.test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {

        GirlFriend gf1 = new GirlFriend("xiaohuihui", 1.78, 19);
        GirlFriend gf2 = new GirlFriend("xiaoshishi", 1.67, 18);
        GirlFriend gf3 = new GirlFriend("xiaodandan", 1.72, 19);

        GirlFriend[] arr = {gf1, gf2, gf3};

        /*Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp >0){
                    return 1;
                } else if (temp <0) {
                    return -1;

                } else {
                    return 0;
                }
            }
        });*/

        //Lambda简写方式
        Arrays.sort(arr,(o1,o2) -> {double temp = o1.getAge() - o2.getAge();
            //三元算法
        temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
        temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

        if (temp >0){
            return 1;
        } else if (temp <0) {
            return -1;

        } else {
            return 0;
        }
        });



        System.out.println(Arrays.toString(arr));
    }
}
