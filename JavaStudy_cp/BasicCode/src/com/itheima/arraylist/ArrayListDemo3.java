package com.itheima.arraylist;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();

        User user1 = new User("001","Tom","123456");
        User user2 = new User("002","Jack","1234567");
        User user3 = new User("003","Pony","12345678");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        boolean flag = contains(list, "003");
        System.out.println(flag);
    }

    public static boolean contains(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
