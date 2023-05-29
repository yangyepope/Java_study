package com.itheima.a01interfacedemo5;

public class Test {
    public static void main(String[] args) {
        InterImpl inter = new InterImpl();
        inter.method();
        inter.method();
//        inter.show();

        Inter.method();
        InterImpl.method();

    }
}
