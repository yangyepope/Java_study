package com.itheima.mygenerics;

public class GenericsInterfaceTest2 {
    public static void main(String[] args) {

        /*
        泛型接口的两种使用方法：
        2. 实现类继续泛型，创建实现类对象时再确定类型
        * */
        MyGenericInterface2<String> myGenericInterface = new MyGenericInterface2<>();
        myGenericInterface.add("123");

    }
}
