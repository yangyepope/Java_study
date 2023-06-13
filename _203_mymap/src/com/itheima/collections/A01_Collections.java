package com.itheima.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class A01_Collections {
    public static void main(String[] args) {

        /*
         * public static <T> boolean addAll(Collection<T> c,T... elements)
         * public static void shuffle(List<?> list)
         * */


        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        System.out.println("==========================================");
        //批量添加元素
        Collections.addAll(arrayList, "bbbb", "aaaa", "ddddddd", "eeeeeeeeeeeee", "ffffffffff");


        System.out.println(arrayList);

        System.out.println("===================sort默认规则=======================");
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("===================sort自定义规则=======================");
        Collections.addAll(arrayList1, 1, 2, 3, 4, 5);
        Collections.sort(arrayList1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        //Lambda表达式简写
        Collections.sort(arrayList1, (o1, o2) -> o2 - o1);
        System.out.println(arrayList1);

        System.out.println("==========================================");
        //shuffle 打乱
        Collections.shuffle(arrayList);

        System.out.println(arrayList);
        System.out.println("===================binarySearch=======================");
        Collections.addAll(arrayList2,1,2,3,4,5,6,7,8,9);
        System.out.println(Collections.binarySearch(arrayList2,8));
        System.out.println(Collections.binarySearch(arrayList2,1));
        System.out.println(Collections.binarySearch(arrayList2,20));


        System.out.println("===================copy=======================");
        Collections.addAll(arrayList3,0,0,0,0,0,0,0,0,0,0);
        Collections.copy(arrayList3,arrayList2);
        System.out.println(arrayList3);

        System.out.println("===================fill=======================");
        ArrayList<Integer> arrayList4 = new ArrayList<>();
        Collections.addAll(arrayList4,1,2,3,4,5,6,7,8,9);
        Collections.fill(arrayList4,100);
        System.out.println(arrayList4);

        System.out.println("===================max/min=======================");
        ArrayList<Integer> arrayList5 = new ArrayList<>();
        Collections.addAll(arrayList5,1,2,3,4,5,6,7,8,9);
        int max = Collections.max(arrayList5);
        System.out.println(max);
        int min = Collections.min(arrayList5);
        System.out.println(min);

        System.out.println("===================swap=======================");
        Collections.swap(arrayList5,5,8);
        System.out.println(arrayList5);

    }
}
