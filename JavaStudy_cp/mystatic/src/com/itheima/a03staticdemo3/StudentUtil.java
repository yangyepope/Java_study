package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil(){

    }

    public static int getMaxAge(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
           int tempAge = list.get(i).getAge();
           if (tempAge > max){
               max = tempAge;
               System.out.println(max);
           }
        }
        return max;
    }
}
