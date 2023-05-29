package com.itheima.a01abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog frog = new Frog("wawa",2);
        System.out.println(frog.getName() +", " + frog.getAge());
        frog.eat();
    }
}
