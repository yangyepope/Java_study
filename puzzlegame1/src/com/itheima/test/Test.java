package com.itheima.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {

        int[] tempArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int temp = tempArr[i];
            int index = random.nextInt(tempArr.length);
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;


        }

        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + ",");
        }

        int[][] data = new int[4][4];
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }


    }
}
