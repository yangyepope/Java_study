package com.itheima.a04objectdemo1;

import com.google.gson.Gson;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {0,1,2,3,4,5,6};
        User user1 = new User(1,"zhangsan","123456","girl",data);
        /*System.out.println(user1);
        User user2 = (User)user1.clone();
        System.out.println(user2);
        Object object = null;*/

        Gson gson = new Gson();

        String s = gson.toJson(user1);
        System.out.println(s);
        User user = gson.fromJson(s, User.class);
        System.out.println(user);


    }
}
