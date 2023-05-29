package com.itheima.test;

import javax.swing.*;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(630, 680);
        jFrame.setTitle("拼图单机版 V1.0");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton jButton = new JButton("点我呀");
        jButton.setBounds(0,0,100,50);
        jButton.addActionListener(new MyActionListener());
        jFrame.getContentPane().add(jButton);

        jFrame.setVisible(true);
    }
}
