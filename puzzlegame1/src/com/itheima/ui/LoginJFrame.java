package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //登录相关
    public LoginJFrame(){
        this.setSize(488,430);
        //设置游戏关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置界面标题
        this.setTitle("拼图 登录");


        this.setVisible(true);
    }
}
