package com.itheima.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        System.out.println();
        System.out.println(arrToString(arr));


    }


    public static String arrToString(int[] arr){
        if (arr == null){
            return "";
        } else if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                result = result + arr[i] + "]" ;
            }else {
                result = result + arr[i] + " ," ;
            }
        }
        return result;
    }
}
