package com.itheima.test;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;



    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role){

        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remainBlood = role.blood - hurt;
        remainBlood = remainBlood < 0 ? 0 :remainBlood;
        role.setBlood(remainBlood);

        System.out.println(this.getName()  + "举起了拳头打了" + role.name + "造成了" + hurt + "点伤害" + role.name + "还剩余" + remainBlood +"点伤害" );
    }
}