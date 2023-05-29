package com.itheima.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    public MyJFrame2(){
        this.setSize(630, 680);
        this.setTitle("拼图单机版 V1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        JButton jButton = new JButton("点我呀");
        jButton.setBounds(0,0,100,50);
        jButton.addMouseListener(this);
        this.getContentPane().add(jButton);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按住不放");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("释放");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("鼠标单击");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("退出");
    }
}
