package com.itheima.a01staticdemo1;

public class StudenTest01 {
    public static void main(String[] args) {
        Student.teacherName = "王老师";
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(23);
        stu1.setGender("男");
//        stu1.teacherName = "王老师";

        stu1.study();
        stu1.show();


        Student stu2 = new Student();
        stu2.setName("李四");
        stu2.setAge(23);
        stu2.setGender("男");

        stu2.study();
        stu2.show();
    }
}
