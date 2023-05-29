package com.itheima.a01interfacedemo3;

public class BasketballSporter extends Sporter implements SpeakEnglish{
    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void SpeakEnglish() {
        System.out.println("说英语");
    }

    @Override
    public void study() {
        System.out.println("学习打篮球");
    }
}
