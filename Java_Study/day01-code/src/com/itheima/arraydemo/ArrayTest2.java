package com.itheima.arraydemo;

public class ArrayTest2 {
    public static void main(String[] args) {
        int count = 0;

        int [] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if (i % 3 == 0){
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
