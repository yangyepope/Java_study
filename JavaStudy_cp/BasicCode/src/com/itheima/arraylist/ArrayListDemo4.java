package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {

        ArrayList<Phone> list = new ArrayList<>();

        Phone phone1 = new Phone("hauwei",8000);
        Phone phone2 = new Phone("xiaomi",1000);
        Phone phone3 = new Phone("chuizi",2999);

        list.add(phone1);
        list.add(phone2);
        list.add(phone3);

        ArrayList<Phone> phoneInfoList = getPhone(list);
        for (int i = 0; i < phoneInfoList.size(); i++) {
            System.out.println(phoneInfoList.get(i).getBrand() + ": " + phoneInfoList.get(i).getPrice());
        }




    }

    public static ArrayList<Phone> getPhone(ArrayList<Phone> list){
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int price = list.get(i).getPrice();
            if (price < 3000){
                resultlist.add(list.get(i));
            }
        }
        return resultlist;
    }

}
