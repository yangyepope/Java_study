package com.itheima.a01interfacedemo3;

public class PingpongCoach extends Coach{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }
}
