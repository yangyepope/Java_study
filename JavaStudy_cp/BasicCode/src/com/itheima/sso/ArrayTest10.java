package com.itheima.sso;

public class ArrayTest10 {
    public static void main(String[] args) {

        int[] arr = {1,9,8,3};

        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] +5;
        }

        for (int i = 0,j = newArr.length - 1; i < j; i++,j--) {
            int temp = newArr[i];
            newArr[i] = newArr[j];
            newArr[j] = temp;
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
