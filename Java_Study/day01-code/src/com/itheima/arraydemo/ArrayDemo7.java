package com.itheima.arraydemo;

public class ArrayDemo7 {
    public static void main(String[] args) {
        int[] arr = {10,8,30,6,67};
        int max = getMax(arr);
        System.out.println(max);
    }

    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
