package com.itheima.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {

        StringJoiner sj = new StringJoiner(", ","[","]");

        sj.add("aaa").add("bbb").add("ccc");
        int len = sj.length();
        System.out.println(len);
        String res = sj.toString();
        System.out.println(res);
    }
}
