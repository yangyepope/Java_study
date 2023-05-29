package com.itheima.stringdemo;

public class StringDemo3 {
    public static void main(String[] args) {
        String str = "abc";
        String res = reverser(str);
        System.out.println(res);
    }


    public static String reverser(String s){
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
}
