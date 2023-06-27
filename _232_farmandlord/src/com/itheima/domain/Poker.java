package com.itheima.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {

    //1. 属性
    private String name;

    //2. 牌的正反面
    private boolean up;

    //3. 判断当前牌是否可以被点击
    private boolean canClick = false;

    //判断当前牌是否被点击
    private boolean clicked = false;

    public Poker(String name, boolean up) {
        this.name = name;
        this.up = up;


        //设置牌的正反面
        if (this.up) {
            turnFront();
        } else {
            turnRear();
        }

        //设置牌的大小
        this.setSize(71, 96);
        this.setVisible(true);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        if (canClick) {
            int step = 0;
            if (clicked) {
                //当前牌已经被点击，向上移动20个位置
                step = 20;

            } else {
                //当前牌已经被点击，向下移动20个位置
                step = -20;
            }
            clicked = !clicked;
            Point from = this.getLocation();
              //设置当前牌的位置
            Point to = new Point(from.x, from.y + step);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void turnFront() {
        //给牌设置正面
        this.setIcon(new ImageIcon("_232_farmandlord\\image\\poker\\" + name + ".png"));
        //修改成员变量
        this.up = true;
    }

    public void turnRear() {
        //给牌设置正面
        this.setIcon(new ImageIcon("_232_farmandlord\\image\\poker\\rear.png"));
        //修改成员变量
        this.up = false;
    }


}
