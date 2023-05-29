package com.itheima.a01morphismdemo1;

public class Test {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("zhangsan");
        student.setAge(23);

        Teacher teacher = new Teacher();
        teacher.setName("MR Wang");
        teacher.setAge(45);


        Administrator administrator = new Administrator();
        administrator.setName("MR Wang");
        administrator.setAge(45);

        register(student);
        register(teacher);
        register(administrator);

        /*1.测试
        2.认证
        3.猜测*/
    }

    public static void register(Person person) {
        person.show();
    }
}
