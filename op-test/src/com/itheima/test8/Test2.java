package com.itheima.test8;

public class Test2 {

    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1 = new Student(1,"zhangsan",25);
        Student stu2 = new Student(2,"lisi",26);
        Student stu3 = new Student(3,"wangwu",27);

        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //id为2的学生，年龄+1
        int index = getIndex(arr,2);
        arr[index].setAge(arr[index].getAge() + 1) ;
        printNewArr(arr);

    }

    public static int getIndex(Student[] arr,int id){
        for(int i=0; i < arr.length; i++){
            Student stu = arr[i];
            if(arr[i] != null){
                int sid= arr[i].getId();
                if (sid == id){
                    int index = i;
                    return i;
                }
            }
        }
        return -1;
    }

    public static void printNewArr(Student[] arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != null) {
                System.out.println(arr[i].getName() + ", " + arr[i].getId() + ", " + arr[i].getAge());
            }
        }
    }
}
