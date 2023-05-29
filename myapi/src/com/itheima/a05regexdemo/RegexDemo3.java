package com.itheima.a05regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo3 {
    public static void main(String[] args) {
        String str = "Java自1995年问世以来，不管IT技术如何地风起云涌，Java8始终以其可移植性、跨平台性、生态系统完备性等特点稳居主流的开发语言之一的位置。并且事实上，Java11无处不在，早已渗入大家的日常生活中，从每一次购物到每一笔在线支付，都有Java17技术的身影，国内外的主流网站大部分都是由Java11技术支撑。";

        String regex = "((?i)Java)(?=8|11|17)";
        String regex1 = "((?i)Java)(8|11|17)";
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";
        String regex4 = "((?i)Java)(?!8|11|17)";
        Pattern pattern = Pattern.compile(regex4);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
