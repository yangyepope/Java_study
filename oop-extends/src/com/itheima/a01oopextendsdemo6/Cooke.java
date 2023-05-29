package com.itheima.a01oopextendsdemo6;

public class Cooke extends Employee{

    public Cooke() {
    }

    public Cooke(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("炒菜");
    }


}
