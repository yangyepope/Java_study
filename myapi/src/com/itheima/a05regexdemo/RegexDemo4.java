package com.itheima.a05regexdemo;

public class RegexDemo4 {
    public static void main(String[] args) {

        String s = "小诗诗shdhsad83838小丹丹jdjsdsu333小惠惠";

        String regex = "[\\w&&[^_]]+";
        String result = s.replaceAll(regex, "VS");
        System.out.println(result);

        String[] split = s.split(regex);
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
