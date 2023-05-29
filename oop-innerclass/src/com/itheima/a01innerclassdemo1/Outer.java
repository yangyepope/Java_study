package com.itheima.a01innerclassdemo1;

public class Outer {
    String name;
   private class Inner{

    }

    public Inner getInstance(){
       return new Inner();
    }
}
