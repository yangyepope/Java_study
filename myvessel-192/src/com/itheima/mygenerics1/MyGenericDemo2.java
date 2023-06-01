package com.itheima.mygenerics1;

import java.util.ArrayList;

public class MyGenericDemo2 {
    public static void main(String[] args) {

        /*
         *  泛型方法
         *
         */

        ArrayList<Ye> arrayList1 = new ArrayList<>();
        ArrayList<Fu> arrayList2 = new ArrayList<>();
        ArrayList<Zi> arrayList3 = new ArrayList<>();
        ArrayList<Student> arrayList4 = new ArrayList<>();

        method(arrayList1);
        method(arrayList2);
        method(arrayList3);

//        method(arrayList4);


        /*
        * 此时，泛型些什么类型，那么就只能传递什么类型的数据
        *
        * 弊端：
        *     利用泛型方法有一个弊端，此时他可以介绍任意的数据类型
        *     Ye Fu Zi  Student
        *
        *希望：本方法虽然不确定类型，但是以后我只希望传递 Ye Fu Zi
        *
        *
        * 此时，我们就可以使用发型的通配符
        *
        * ？表示不确定类型
        * ？extends E：表示可以传递E或者E所有的子类类型
        * ？super E：表示可以传递E或者E所有的父类类型
        *
        * */






    }


    /*
     * 泛型方法
     * */

    public  static<E> void  method(ArrayList<?extends Ye> list){

    }
}

class Student{}


