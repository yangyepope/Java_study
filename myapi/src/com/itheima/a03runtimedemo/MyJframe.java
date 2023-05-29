package com.itheima.a03runtimedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {

    JButton yesBut = new JButton("帅爆了");
    JButton midBut = new JButton("一般般吧");
    JButton notBut = new JButton("很寒碜");



    public MyJframe() throws HeadlessException {
        initJframe();
        initView();

        this.setVisible(true);


    }

    private  void initView() {
        this.getContentPane().removeAll();

        JLabel text = new JLabel("你觉得自己帅吗");
        text.setFont(new Font("微软雅黑",0,30));
        text.setBounds(120,150,300,50);

        yesBut.setBounds(200,250,100,30);
        midBut.setBounds(200,325,100,30);
        notBut.setBounds(200,400,130,30);


        yesBut.addActionListener(this);
        midBut.addActionListener(this);
        notBut.addActionListener(this);

        this.getContentPane().add(text);
        this.getContentPane().add(yesBut);
        this.getContentPane().add(midBut);
        this.getContentPane().add(notBut);


    }


    private void initJframe(){
        this.setSize(500,600);

        this.setTitle("恶搞好基友");

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setAlwaysOnTop(true);

        this.setLocationRelativeTo(null);

        this.setLayout(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == yesBut ){
            System.out.println("你的好基友帅爆了");
            showJDialog("俊铁铁，你太自信了，给你一点小惩罚");
            try {
                Runtime.getRuntime().exec("shutdown -s -t 3600");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (object == midBut) {
            System.out.println("你的好基友一般般吧");
        }else if (object == notBut){
            System.out.println("你的好基友不帅");
        }

    }

    private static void showJDialog(String content) {
        JDialog jDialog = new JDialog();
        jDialog.setSize(200,150);
        jDialog.setAlwaysOnTop(true);
        jDialog.setLocationRelativeTo(null);
        jDialog.setModal(true);

        JLabel warning = new JLabel(content);
        warning.setBounds(0,0,200,150);
        jDialog.getContentPane().add(warning);

        jDialog.setVisible(true);
    }
}
