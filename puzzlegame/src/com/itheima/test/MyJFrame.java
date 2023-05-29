package com.itheima.test;

import javax.swing.*;

public class MyJFrame extends JFrame {
    public MyJFrame(){
        this.setSize(630, 680);
        this.setTitle("拼图单机版 V1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        JButton jButton = new JButton("点我呀");
        jButton.setBounds(0,0,100,50);
        jButton.addMouseListener(new MyMouseListener());

        this.getContentPane().add(jButton);
        this.setVisible(true);
    }
}
