package com.itheima.mygenerics;

public class GenericsInterfaceTest {
    public static void main(String[] args) {

        /*
        泛型接口的两种使用方法：
        1. 实现类给出具体的类型
        * */
        MyGenericInterface myGenericInterface = new MyGenericInterface();
        myGenericInterface.add("yes");
    }
}
