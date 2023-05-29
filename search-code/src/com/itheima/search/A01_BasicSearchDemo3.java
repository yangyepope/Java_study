package com.itheima.search;

public class A01_BasicSearchDemo3 {
    public static void main(String[] args) {
        int[] arr = {7, 23, 79, 81, 103, 127, 137, 147};
        System.out.println(basicSearch(arr, 150));

        /*
         * 二分查找法
         * 1.当mid比number大，max等于mid - 1
         * 2. 当mid比number小，min等于mid + 1
         * 3. 当min大于max时，说明该值不存在返回-1
         *
         * */
    }

    public static int basicSearch(int[] arr, int number) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (min + max) / 2;
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else if (arr[mid] == number) {
                return mid;
            }
        }
    }
}
