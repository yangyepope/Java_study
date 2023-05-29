package com.itheima.arraydemo;

import java.lang.reflect.Array;

public class ArrayDemo9 {
    public static void main(String[] args) {
        int[] arr = {10,6,8,4,7,5};
        int[] arr1 = copyOfRange(arr,2,5);
        printArr(arr1);

    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {
            newArr[i-from] = arr[i];
        }
        return newArr;
    }

    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1 ){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + " ,");
            }
        }
        System.out.println("]");
    }
}
