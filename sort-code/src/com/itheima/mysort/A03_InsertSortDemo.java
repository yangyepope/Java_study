package com.itheima.mysort;

public class A03_InsertSortDemo {
    public static void main(String[] args) {

        int[] arr = {3, 44, 100, 5, 19, 7, 60, 34, 20, 77, 6, 89, 10, 0, -1};
        int startIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            //避免影响外面for循环的i的值，将i的值赋值给j
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {

                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;


            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
