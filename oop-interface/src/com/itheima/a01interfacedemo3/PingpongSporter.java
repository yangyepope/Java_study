package com.itheima.a01interfacedemo3;

public class PingpongSporter extends BasketballSporter{
    public PingpongSporter() {
    }

    public PingpongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学习打乒乓球");
    }
}
