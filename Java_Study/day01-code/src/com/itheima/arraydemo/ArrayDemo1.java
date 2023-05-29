package com.itheima.arraydemo;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
    /*    for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        } */

        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
