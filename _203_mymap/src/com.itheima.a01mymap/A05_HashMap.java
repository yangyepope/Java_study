package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A05_HashMap {
    public static void main(String[] args) {
        /*
         * 需求：创建一个HashMap集合，键是学生对象（Student），值是籍贯（String）
         * 存储三个键值对象元素，并遍历
         * 需求：同姓名，同年龄认为是一个人
         *
         *
         * */

        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("王五", 25);

        hm.put(s1, "江苏");
        hm.put(s2, "浙江");
        hm.put(s3, "福建");
        hm.put(s4, "湖北");

//        System.out.println(hm);


        //使用keySet方法进行遍历
        Set<Student> students = hm.keySet();
        for (Student student : students) {
            String value = hm.get(student);
            System.out.println(student + "=" + value);
        }
        System.out.println("============================================");
        //使用entrySet方法进行遍历
        Set<Map.Entry<Student, String>> entries = hm.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);

        }

        System.out.println("============================================");
        hm.forEach((student, s) -> System.out.println(student + "=" + s)
        );

    }
}
