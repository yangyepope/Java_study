package com.itheima.test8;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        //1.创建数组对象用于存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象并添加到数组中
        Student stu1 = new Student(1,"zhangshan",24);
        Student stu2 = new Student(2,"lisi",25);
        Student stu3 = new Student(3,"wangwu",26);
        //3.把学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getIndex(arr,2);
        if(index >= 0){
            arr[index] = null;
            printNewArr(arr);


        }else{
            System.out.printf("删除失败");
        }



    }

    public static void printNewArr(Student[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != null) {
                System.out.println(arr[i].getName() + ", " + arr[i].getId() + ", " + arr[i].getAge());
            }
        }
    }


    public static int getIndex(Student[] arr,int id){
        for(int i=0;i <arr.length;i++){
            Student stu = arr[i];
            if(stu != null){
                int sid = stu.getId();
                if(sid == id){
                    return i;
                }
            }

        }
        //当循环结束之后还没有找到，说明不存在
        return -1;
    }


}
