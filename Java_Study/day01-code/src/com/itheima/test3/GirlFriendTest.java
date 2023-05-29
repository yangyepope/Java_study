package com.itheima.test3;

import javax.sound.midi.Soundbank;

public class GirlFriendTest {

    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend();
        gf1.setAge(-18);
        gf1.setName("Rose");


        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());

        gf1.eat();
        gf1.sleep();
    }


}
