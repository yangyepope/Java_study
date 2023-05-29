package com.itheima.arraydemo;

public class ArrayDemo8 {
    public static void main(String[] args) {
        int[] arr = {10,2,37,63,5,89};
        boolean flag=contains(arr,10);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        return false;
    }
}
