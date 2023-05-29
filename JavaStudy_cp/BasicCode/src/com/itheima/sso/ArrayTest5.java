package com.itheima.sso;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = {33,5,40,78};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
