package com.itheima.test;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {



        Huskey huskey = new Huskey("丢丢",3);

        ArrayList<Huskey> arrayList1 = new ArrayList<>();
        ArrayList<TeddyDog> arrayList2 = new ArrayList<>();
        ArrayList<LiHuaCat> arrayList3 = new ArrayList<>();
        ArrayList<PersianCat> arrayList4 = new ArrayList<>();

        keepPet(arrayList2);
        keepPet(arrayList1);

    }


    public static void keepPet(ArrayList<? extends Dog> list){

    }
}
