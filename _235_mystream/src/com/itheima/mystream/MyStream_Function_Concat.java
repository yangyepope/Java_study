package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class MyStream_Function_Concat {
    public static void main(String[] args) {
        /*
        *
        * 合并a和b两个流为同一个流
        * */
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList,"张无忌","赵敏","金毛狮王");
        Collections.addAll(arrayList1,"张三风","张良","周子然","赵敏","金毛狮王");
        Stream.concat(arrayList.stream(),arrayList1.stream()).forEach(s -> System.out.println(s));

    }
}
