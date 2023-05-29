package com.itheima.sso;

import java.util.Scanner;

public class ArrayTest9 {
    public static void main(String[] args) {
        int[] scores = getScores();
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }
        int max = getMax(scores);
        System.out.println(max);
        int min = getMin(scores);
        System.out.println(min);


    }

    public static int getMax(int[] scores){
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= max){
              max = scores[i];
            }
        }
        return max;
    }


    public static int getMin(int[] scores){
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (min >= scores[i]){
                min = scores[i];
            }
        }
        return min;
    }

    public static int[] getScores(){
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; ) {
            System.out.println("请输入一个分数");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
                i++;
            }else {
                System.out.println("您输入的分数无效，请重新输入");
            }

        }
        return scores;
    }




}
