package com.itheima.a01innerclassdemo3;

public class Outer {

    static class Inner{
        public void show1(){
            System.out.println("非静态的方法调用了");
        }

        public static void show2(){
            System.out.println("静态的方法调用了");
        }
    }
}
