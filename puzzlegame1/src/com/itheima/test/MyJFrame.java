package com.itheima.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    JButton jButton1 = new JButton("点我呀");
    JButton jButton2 = new JButton("再点我呀");

    public MyJFrame(){
        JFrame jFrame = new JFrame();
        jFrame.setSize(630, 680);
        jFrame.setTitle("拼图单机版 V1.0");
        jFrame.setAlwaysOnTop(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLayout(null);

        //创建一个按钮对象
//        JButton jButton1 = new JButton("点我呀");
        jButton1.setBounds(0,0,100,50);
        jButton1.addActionListener(this);

//        JButton jButton2 = new JButton("再点我呀");
        jButton2.setBounds(100,0,100,50);
        jButton2.addActionListener(this);

        jFrame.getContentPane().add(jButton1);
        jFrame.getContentPane().add(jButton2);



        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == jButton1){
            jButton1.setSize(200,200);
        }else if(source == jButton2 ){
            Random random = new Random();
//            jButton2.setBounds(random.nextInt(500),random.nextInt(500),100,50);
            jButton2.setLocation(random.nextInt(500),random.nextInt(500));
        }

    }
}
