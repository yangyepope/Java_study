package com.itheima.test3;

public class GameTest {
    public static void main(String[] args) {
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'男');

        r1.showRoleInfo();
        System.out.println();
        r2.showRoleInfo();


        while (true){
            //1. 乔峰打鸠摩智
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
