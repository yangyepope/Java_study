package com.itheima.object;

public class GirlFriendTest {

    public static void main(String[] args) {

        GirlFriend gf1 = new GirlFriend();
        gf1.age = 18;
        gf1.name = "Rose";
        gf1.gender = "male";

        System.out.println(gf1.age);
        System.out.println(gf1.name);
        System.out.println(gf1.gender);
        System.out.println("======================");
        gf1.eat();
        gf1.sleep();
    }
}
