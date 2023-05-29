package com.itheima.a05regexdemo;

public class RegexDemo5 {
    public static void main(String[] args) {
        /*
         需求一：判断一个字符串开头和结尾是否一致，只考虑一个字符
         举例：
         a123a   b456b   17891   &abc&   a123b
        */

        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));

        /*
         需求二：判断一个字符串开头和结尾是否一致，可以考虑多个字符
         举例：
         abc123abc  b456b   123789123   &&abc&&   abc123bc
        */
        System.out.println("-------------------------------------");
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&&abc&&".matches(regex2));
        System.out.println("abc123bc".matches(regex2));

         /*
         需求三：判断一个字符串开始和结束部分是否一致，开始部分内容每个字符也需要一致
         举例：
         aaa123aaa  bbb456bbb   111789111   &&abc&&
        */
        System.out.println("-------------------------------------");
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
    }
}
