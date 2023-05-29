package com.itheima.a01jdk7datademo1;

import java.time.LocalDate;

public class Test5 {
    public static void main(String[] args) {
        /*
        * 计算某一年是平年还是闰年
        * 闰年366天，平年365天
        * 判断改年的2月有多少天
        * */

        LocalDate localDate = LocalDate.of(2000,3,1);
        System.out.println(localDate.isLeapYear());
        LocalDate localDate1 = localDate.minusDays(1);
        System.out.println(localDate1.getDayOfMonth());

    }
}
