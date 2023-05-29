package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
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
        jButton.setBounds(0, 0, 100, 50);
        jButton.addActionListener(new ActionListener() {
              @Override
              public void actionPerformed(ActionEvent e) {
                  System.out.println("不要点我呀啊");
              }
          }

        );
        jFrame.add(jButton);

        jFrame.setVisible(true);
    }
}
