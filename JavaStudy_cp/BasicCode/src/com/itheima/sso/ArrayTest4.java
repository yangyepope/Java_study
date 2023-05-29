package com.itheima.sso;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr = {33,5,40,78};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
