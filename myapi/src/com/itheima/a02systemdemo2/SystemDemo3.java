package com.itheima.a02systemdemo2;

public class SystemDemo3 {
    public static void main(String[] args) {

        Student student1 = new Student("zhangshan", 25);
        Student student2 = new Student("lisi", 26);
        Student student3 = new Student("wangwu", 27);

        Student[] arr1 = {student1, student2, student3};
        Student[] arr2 = new Student[3];
        Person[] arr3 = new Person[3];
        System.arraycopy(arr1,0,arr3,0,3);
//        System.out.println(arr2[2].getAge() + " " + arr2[2].getName() );
//        System.arraycopy(arr1,0,arr2,0,1);
        for (int i = 0; i < arr3.length; i++) {
            Student stu = (Student) arr3[i];
            System.out.println(stu.getAge());
        }

    }


}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
