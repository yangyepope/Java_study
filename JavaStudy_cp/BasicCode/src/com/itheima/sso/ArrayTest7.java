package com.itheima.sso;

import java.util.Random;

public class ArrayTest7 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25){
                chs[i] = (char)(97 + i);
            }else {
                chs[i] = (char)(65 + i -26);
            }

        }

        String result = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }

        System.out.println(result);
    }
}
