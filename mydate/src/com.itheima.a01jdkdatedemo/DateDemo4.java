package com.itheima.a01jdkdatedemo;

import java.util.Calendar;
import java.util.Date;

public class DateDemo4 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar);
        Date date = new Date(0L);
        calendar.setTime(date);
        System.out.println(calendar);


        System.out.println(calendar.get(1));

        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        int week = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(getWeek(week));


        calendar.set(Calendar.YEAR,2003);
        System.out.println(calendar);


    }
    public static String getWeek(int index){
        String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[index];

    }
}
