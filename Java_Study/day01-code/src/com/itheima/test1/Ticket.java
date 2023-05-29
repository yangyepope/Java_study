package com.itheima.test1;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前的月份");
        int mon = sc.nextInt();
        System.out.println("请输入仓型1 2");
        int seat = sc.nextInt();

        if (mon >= 5 && mon <= 10){
            if (seat == 0){
                ticket = (int)(ticket * 0.9);
            }else if(seat == 1){
                ticket = (int)(ticket * 0.8);
            }else {
                System.out.println("没有这个仓型");
            }

        }else if((mon >= 1 && mon <= 4) || (mon >=11 && mon <=12)){
            if (seat == 0){
                ticket = (int)(ticket * 0.7);
            }else if(seat == 1){
                ticket = (int)(ticket * 0.65);
            }else {
                System.out.println("没有这个仓型");
            }
        }else {
            System.out.println("您输入的月份有误");
        }
        System.out.println(ticket);
    }
}
