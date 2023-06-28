package com.itheima.mystream;

import java.util.ArrayList;
import java.util.Collections;

public class MyStream_Function_Distinct {
    public static void main(String[] args) {

        /*
        *
        *
        *
        *
        * distinct 元素去重，依赖（hashCode和equals方法）
        * tips：
        * 1. 中间方法返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
        * 2. 修改Stream流中的数据时，不会影响原来集合或者数组中的元素
        *
        * */
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"张无忌","张无忌","张无忌","周星驰","张三风","张良","周子然","赵敏","金毛狮王");
        arrayList.stream().distinct().forEach(s -> System.out.println(s));
    }
}
