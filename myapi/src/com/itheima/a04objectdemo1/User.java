package com.itheima.a04objectdemo1;

import java.util.StringJoiner;

public class User implements Cloneable{
    int id;
    String username;
    String password;
    String path;
    int[] data = {0,1,2,3,4,5,6};

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", 进度: " + arrToString() + "}";

    }

    public String arrToString(){
        StringJoiner stringJoiner = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            stringJoiner.add(data[i] + " ");
        }
        return stringJoiner.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] data = this.data;
        int[] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        User u = (User) super.clone();
        u.data = newData;
        return u;
    }
}
