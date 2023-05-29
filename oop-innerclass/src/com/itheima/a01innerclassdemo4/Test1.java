package com.itheima.a01innerclassdemo4;

public class Test1 {
    public static void main(String[] args) {


        new Swim(){
            @Override
            public void swim() {
                System.out.println("游泳");
            }
        };

    }



}
