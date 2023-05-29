package com.itheima.a01interfacedemo3;

public class BasketballCoach extends Coach implements SpeakEnglish{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("说英语");
    }
}
