package com.itheima.a01innerclassdemo1;

public class Test {
    public static void main(String[] args) {
//        Outer.Inner io = new Outer().new Inner();

        Outer o = new Outer();
        Object inner = o.getInstance();
        System.out.println(inner);
    }
}
