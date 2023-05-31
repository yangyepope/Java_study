package com.itheima.mygenerics;

import java.util.ArrayList;

public class GenericTest1 {
    public static void main(String[] args) {
        ArrayList<String>  arrayList= new ArrayList<>();

        ListUtil.addAll(arrayList,"aaa","bbbb","ccc");
        System.out.println(arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ListUtil.addAll(arrayList1,11,22,33);
        System.out.println(arrayList1);
    }
}
