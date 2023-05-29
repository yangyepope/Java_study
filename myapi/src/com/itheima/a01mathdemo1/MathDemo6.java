package com.itheima.a01mathdemo1;

public class MathDemo6 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            boolean flag = isPrime2(i);
            if (flag) {
                System.out.println(i);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }


    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime2(int number){
        double num = Math.sqrt(number);
        for (int i = 2; i < num; i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}
