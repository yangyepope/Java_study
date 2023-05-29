package com.itheima.a01interfacedemo5;

public class InterImpl implements Inter{
    @Override
    public void show() {
        System.out.println("重写的show方法");
    }

    public static void method(){
        System.out.println("InterImpl的method方法");
    }
}
