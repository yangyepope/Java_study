package com.itheima.a01jdkdatedemo;

import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {
        // 1. 创建一个对象表示时间原点
        extracted();


    }

    private static void extracted() {
        Date date = new Date(0L);

        //2. 获取data时间的毫秒值
        long time = date.getTime();
//        System.out.println(time);

        // 3. 在该基础上加上一年的毫秒值
        long l = 1000L * 60 * 60 * 24 * 365;
        time = time + l;

        // 4.计算之后的时间毫秒值，再设置回date当中
        date.setTime(time);

        System.out.println(date);
    }
}
