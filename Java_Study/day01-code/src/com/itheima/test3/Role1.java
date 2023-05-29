package com.itheima.test3;

public class Role1 {
    private String name;
    private int blood;
    private char gender;

    public Role1() {
    }

    public Role1(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
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
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    /**
     * 获取
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toString() {
        return "Role1{name = " + name + ", blood = " + blood + ", gender = " + gender + "}";
    }
}
