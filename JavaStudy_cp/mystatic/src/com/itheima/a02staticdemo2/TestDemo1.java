package com.itheima.a02staticdemo2;

public class TestDemo1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        String s = ArrayUtil.printArray(arr1);
        System.out.println(s);

        double[] arr2 = {1.3, 1.4, 3.5, 5.6, 7.4};
        double s2 = ArrayUtil.getAverage(arr2);
        System.out.println(s2);
    }
}
