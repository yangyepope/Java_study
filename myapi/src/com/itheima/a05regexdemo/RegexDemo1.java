package com.itheima.a05regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {


        /*邮箱验证
        323333@qq.com   zhangsan@itcast.cnn   dlei00009@163.com  dlei8889@pci.com.cn

        */


        String regex = "\\w+@[\\w&&[^_]]{2,3}(\\.[a-zA-Z]{2,3}){1,2}";

        System.out.println("dlei8889@pci.com.cn".matches(regex));

        /*
        简单身份证校验
        */


        String sfz = "429006199110148731";
        String regex2 =  "[1-9]\\d{16}[\\dXx]";
        String regex3 =  "[1-9]\\d{16}(\\d|X|x)";
        String regex6 =  "[1-9]\\d{16}(\\d|(?!)x " +
                ")";
        System.out.println(sfz.matches(regex2));

        /* 忽略大小写
          abc
        */

        String regex4 = "(?!)abc";

        /* 忽略大小写 只忽略一个字母大小写
          abc
        */

        String regex5 = "a((?!)b)c";


        /*严格身份证校验
        429007 1989 01 23 874X
        1. 前面六位，第一位不能为0
        2. 年份  18 19 20；  后面任意
        3. 月份  01 ~ 12
        4. 日期  01 ~ 31
        5. 前三位任意

        */

        String regex7 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        String sfz1 = "429007198901123874X";
        System.out.println(sfz1.matches(regex7));

    }
}
