package com.itheima.object;

public class Phone {
    String brand;
    double price;

    public void call(){
        System.out.println("打电话");
    }

    public void playGame(){
        System.out.println("打游戏");
    }

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}



