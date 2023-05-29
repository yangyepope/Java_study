package com.itheima.a01mathdemo1;

public class MathDemo5 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1000; i < 10000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum == i){
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
