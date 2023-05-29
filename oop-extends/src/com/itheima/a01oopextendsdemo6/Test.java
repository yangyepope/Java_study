package com.itheima.a01oopextendsdemo6;

public class Test {
    public static void main(String[] args) {
//        Manager manager = new Manager();
        Manager manager = new Manager("heima001","张三",15000,2000);
        System.out.println(manager.getId() + ", " + manager.getName()  + ", " + manager.getBouns()  + ", " + manager.getSalary());
        manager.work();
        manager.eat();
        Cooke cooke = new Cooke("heima002","李四",13000);
        System.out.println(cooke.getId() + ", " + cooke.getName()  + ", " + cooke.getSalary());
        cooke.eat();
        cooke.work();

    }
}
