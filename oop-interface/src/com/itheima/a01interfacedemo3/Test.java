package com.itheima.a01interfacedemo3;

public class Test {
    public static void main(String[] args) {
        BasketballSporter basketballSporter = new BasketballSporter("王玲", 23);
        System.out.println(basketballSporter.getAge() + " ," + basketballSporter.getName());
        basketballSporter.SpeakEnglish();
        basketballSporter.study();


    }
}
