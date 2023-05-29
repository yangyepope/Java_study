package com.itheima.test;

public class GirlFriend {
    private String name;
    private double height;
    private int age;


    public GirlFriend() {
    }

    public GirlFriend(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", height = " + height + ", age = " + age + "}";
    }
}
