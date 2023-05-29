package com.itheima.test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {

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
