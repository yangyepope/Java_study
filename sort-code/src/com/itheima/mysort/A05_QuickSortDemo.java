package com.itheima.mysort;

public class A05_QuickSortDemo {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1,0};
        quickSort(arr, 0, 4);
        printArr(arr);


    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        if (start > end) {
            return;
        }

        while (start < end) {

            while (arr[end] > arr[i] && end > start) {
                end--;
            }


            while (arr[start] <= arr[i] && end > start) {
                start++;
                ;
            }


            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


        }


        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        System.out.println(start + " " + end);


        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
