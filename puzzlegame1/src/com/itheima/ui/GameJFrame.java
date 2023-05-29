package com.itheima.ui;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GameJFrame extends JFrame {

    //成员变量
    int[][] data = new int[4][4];

    //GameJFrame游戏的主界面
    public GameJFrame() {


        initJFrame();

        //创建菜单
        initJMenuBar();
        //初始化数据
        initData();
        //初始化图片
        initImage();
        //图片设置可见
        this.setVisible(true);
    }

    private  void initData() {
        int[] tempArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Random random = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int temp = tempArr[i];
            int index = random.nextInt(tempArr.length);
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;


        }

        /*for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + ",");
        }*/


        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }



    }

    private void initImage() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建JLabel的对象
                JLabel jLabel1 = new JLabel(new ImageIcon("D:\\37 JavaStudy\\puzzlegame\\image\\animal\\animal1\\A0233321_" + data[i][j] + ".png"));
                jLabel1.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
        /*写法1
        this.add(jLabel1);*/
//        写法2
                this.getContentPane().add(jLabel1);
            }


        }


    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        //创建
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建item
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        //添加到JMenu中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //添加到JMenuBar中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //设置JMenuBar
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        this.setSize(630, 680);
        this.setTitle("拼图单机版 V1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
    }
}
