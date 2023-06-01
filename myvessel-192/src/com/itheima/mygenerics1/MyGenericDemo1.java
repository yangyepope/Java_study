package com.itheima.mygenerics1;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

public class MyGenericDemo1 {
    public static void main(String[] args) {

        /*
        *  泛型不具备继承性，但是数据具备
        *
        */

        ArrayList<Ye> arrayList1 = new ArrayList<>();
        ArrayList<Fu> arrayList2 = new ArrayList<>();
        ArrayList<Zi> arrayList3 = new ArrayList<>();

        method(arrayList1);
//        method(arrayList2);
//        method(arrayList3);

        //数据具备继承性
        arrayList1.add(new Ye());
        arrayList1.add(new Fu());
        arrayList1.add(new Zi());






    }


    /*
    * 此时，泛型里面些什么类型，那么只能传递什么类型的数据
    * */
    public  static void  method(ArrayList<Ye> arrayList){

    }
}


class Ye{}

class Fu extends Ye{}

class Zi extends Fu{}
