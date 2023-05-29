package com.itheima.a01innerclassdemo4;

public class Test {

    public static void main(String[] args) {
        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头");
                    }
                }


        );
    }

    public static void method(Animal animal){
        animal.eat();
    }
}
