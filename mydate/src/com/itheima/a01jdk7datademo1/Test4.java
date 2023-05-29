package com.itheima.a01jdk7datademo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        /*
         * 计算自己活了多少天，分别使用JDK7和JDK8进行计算
         *
         * */

        // JDK7:先分别获取两个时间的毫秒值在进行计算

        String birthDay = "1991年10月14日";
        long currentTimeMillis = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = simpleDateFormat.parse(birthDay);
        long birthDayTime = date.getTime();
        long time = birthDayTime - currentTimeMillis;
        System.out.println(time / 1000 / 60 / 60 / 24);

        // JDK8:使用chronoUnit

        LocalDate localDate = LocalDate.of(1991, 10, 14);
        LocalDate now = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(localDate, now));


    }
}
