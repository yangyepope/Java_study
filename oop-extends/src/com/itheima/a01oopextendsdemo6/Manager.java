package com.itheima.a01oopextendsdemo6;

public class Manager extends Employee {
    private double bouns;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }
}
