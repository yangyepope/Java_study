package com.itheima.a01interfacedemo4;

public interface Inter {
    public void show();

    public default void method(){
        System.out.println("默认method方法");
    }
}
