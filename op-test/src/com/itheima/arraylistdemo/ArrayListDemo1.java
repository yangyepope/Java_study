package com.itheima.arraylistdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("点赞了吗?");
        list.add("收藏了吗?");
        list.add("投币了吗?");
        list.add("转发了吗?");

        System.out.println(list);
    }
}
