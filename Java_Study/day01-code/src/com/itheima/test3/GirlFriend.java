package com.itheima.test3;

public class GirlFriend {
    private String name;
    private String gender;
    private int age;

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setAge(int a){
        if (a>= 18 && a <= 50){
            age= a;
        }else {
            System.out.println("非法参数");
        }

    }

    public int getAge(){
        return age;
    }

    public void setGender(String g){
        gender = g;
    }

    public String getGender(){
        return gender;
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
