package com.itheima.a01jdkdatedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class DateDemo3 {
    public static void main(String[] args) throws ParseException {

        /*String s = "2023-11-11 11:11:11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        System.out.println(date);
        System.out.println(date.getTime());
        1699672271000
        */

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date date = new Date(1699672271000L);
        System.out.println(simpleDateFormat.format(date));


    }

    private static void extracted() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date d = new Date(0L);
        String s = simpleDateFormat.format(d);
        System.out.println(s);


        SimpleDateFormat simpleDateFormat1 =new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
//        Date date = new Date();
        String s1 = simpleDateFormat1.format(d);
        System.out.println(s1);
    }
}
