package com.itheima.mysort;

import java.util.Random;
import java.util.Timer;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = new int[100000];

        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt();
            arr[i] = r;
        }

//        printArr(arr);
        System.out.println("============================================================================");


        long startTime1 = System.currentTimeMillis();
        quickSort(arr,0,99999);
        long endTime1 = System.currentTimeMillis();
        long time1 = endTime1 - startTime1;
//        printArr(arr);
        System.out.println(time1);

        long startTime2 = System.currentTimeMillis();
        Bubble(arr);
        long endTime2 = System.currentTimeMillis();
        long time2 = endTime2 - startTime2;
        System.out.println(time2);


    }


    public static void quickSort(int[] arr,int i,int j){
        //start，找比0索引大的
        int start=i;
        //end,找比0索引小的
        int end=j;

        if(start>end){//递归的出口,要写在basenum的前面
            return;
        }

        //basenum表示arr[0]基准数
        int basenum=arr[i];

        //利用循环找到要交换的数字，注意最外层的大循环是start!=end
        while(start!=end){
            while(true){
                //利用end从后往前找比基准数小的，注意要先移动end再移动start
                if(end<=start||arr[end]<basenum){
                    break;
                }
                end--;
            }

            while(true){
                //利用start，从前往后开始找，找比基准数大的
                if(end<=start||arr[start]>basenum){
                    break;
                }
                start++;
            }

            //两个循环都结束了，说明到这里start和end已经找到，这里进行交换
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

        //最外层循环结束说明end==start，此时基准元素归位
        int temp2=arr[i];
        //i是传进来的参数，表示要排序数组的起始索引,
        // 注意此处arr[i]不能用bsenum替代，因为basenum仅表示一个数，不表示数组中的元素
        arr[i]=arr[start];
        arr[start]=temp2;

        //确定6左边的范围，重复刚刚所做的所有事
        quickSort(arr,i,start-1);//递归

        //确定6右边的范围，重复刚刚所做的所有事
        quickSort(arr,start+1,j);
    }



    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
        }
    }

    public static void Bubble(int[] arr) {
        //1、定义数组

        //利用冒泡排序将数组中的元素变成1 2 3 4 5
        //第一轮结束之后，最大值在数组的最右边 .....5
        //外循环：表示我要执行多少轮，如果有n个数据那么执行n-1轮
        for (int i = 0; i < arr.length-1; i++) {
//            System.out.println(System.currentTimeMillis());
            //内循环：每一轮中我如何比较数据并找到当前的最大值
            //-1：为防止索引越界
            //-i:提高效率，每一轮执行的次数应该比上一轮少一次
            for(int j=0;j<arr.length-1-i;j++){//选中j，按shift+f6即可替换循环中所有用到j的地方
                //i依次表示数组中的每一个索引0 1 2 3 4
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
        }
    }

}
