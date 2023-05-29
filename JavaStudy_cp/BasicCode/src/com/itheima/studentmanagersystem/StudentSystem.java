package com.itheima.studentmanagersystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        loop: while (true) {
            System.out.println("------------欢迎来到黑马学生管理系统------------");
            System.out.println("1：添加学生");
            System.out.println("2：删除学生");
            System.out.println("3：修改学生");
            System.out.println("4：查询学生");
            System.out.println("5：退出");
            System.out.println("请输入您的选择");

            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }


    public static void addStudent(ArrayList<Student> list){
//        System.out.println("添加学生");
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);

        String id = null;

        while (true) {
            System.out.println("请输入学生ID");
            id = sc.next();
            boolean flag = contains(list,id);
            if (flag){
                System.out.println("id已经存在，请重新输入");
                continue;

            }else {
                stu.setId(id);
                break;
            }
        }

        System.out.println("请输入学生姓名");
        stu.setName(sc.next());
        System.out.println("请输入学生年龄");
        stu.setAge(sc.nextInt());
        System.out.println("请输入学生家庭地址");
        stu.setAddress(sc.next());

        list.add(stu);
        System.out.println("学生信息输入成功");




    }

    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        Boolean flag = contains(list,id);
        if (flag){
            int index = getIndex(list,id);
            list.remove(index);
        }else {
            System.out.println("id不存在，请重新输入");
        }

    }

    public static void updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生id");
        String id = sc.next();
        boolean flag = contains(list,id);
        if (!flag){
            System.out.println("id" + id + "不存在，请重新输入");
        }

        int index = getIndex(list, id);
        Student stu = list.get(index);

        System.out.println("请输入学生姓名");
        String name = sc.next();
        stu.setName(name);

        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        stu.setAge(age);

        System.out.println("请输入学生地址");
        String address = sc.next();
        stu.setAddress(address);
        System.out.println("学生信息更新完成");
    }


    public static void queryStudent(ArrayList<Student> list){
        if (list.size() == 0){
            System.out.println("当前无学生信息，请添加后查询");
            return;
        }
        System.out.println("ID\t\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }

    }


    public static boolean contains(ArrayList<Student> list,String id){
//        for (int i = 0; i < list.size(); i++) {
//            Student stu = list.get(i);
//            String sid = stu.getId();
//            if (sid.equals(id)){
//                return true;
//            }
//        }
//        return false;
//        int index = getIndex(list, id);
//        if (index >= 0){
//            return true;
//        }
//        return false;
        return getIndex(list, id) >= 0;
    }

    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
