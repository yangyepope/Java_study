package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.Objects;
import java.util.Random;

public class GameJFRame extends JFrame implements KeyListener, ActionListener {

    //成员变量
    int[][] data = new int[4][4];
    int[][] win = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
    };
    int x = 0;
    int y = 0;
    int step = 0;
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");

    JMenuItem accountItem = new JMenuItem("公众号");

    public GameJFRame() {
        //成员变量


        initJFrame();

        //创建菜单
        initJMenuBar();

        //初始化数据
        initData();

        //初始化图片
        initImage();
        initJButtom();


        this.setVisible(true);
    }

    private static void initJButtom() {
//        initJButtom;
    }

    private void initData() {
        int[] tempArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 1) {
                x = i / 4;
                y = i % 4;

            }
            data[i / 4][i % 4] = tempArr[i];



        }

        /*for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {


            }
        }*/


    }


    private void initImage() {
        this.getContentPane().removeAll();
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("D:\\01 文件和材料\\102 Java_study\\puzzlegame\\image\\background\\722689F6-8192-4dd5-B5AC-AB5CCCA4AD8B.png"));
            winJLabel.setBounds(203, 283, 197, 110);
            this.getContentPane().add(winJLabel);
        }

        JLabel stepCount = new JLabel("步数：" + step);
        stepCount.setBounds(50, 10, 100, 20);
        this.getContentPane().add(stepCount);

//        int number = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建JLabel的对象
                JLabel jLabel1 = new JLabel(new ImageIcon("D:\\01 文件和材料\\102 Java_study\\puzzlegame\\image\\animal\\animal1\\A0233321_" + data[i][j] + ".png"));
                jLabel1.setBounds(105 * j + 83, 105 * i + 105, 105, 105);
                jLabel1.setBorder(new BevelBorder(BevelBorder.LOWERED));
        /*写法1
        this.add(jLabel1);*/
//        写法2
                this.getContentPane().add(jLabel1);
//                number++;
            }


        }

        ImageIcon imageIcon = new ImageIcon("D:\\01 文件和材料\\102 Java_study\\puzzlegame\\image\\background\\ABD19194-83F6-423d-99F1-09BA92719AA6.png");
        JLabel backgorund = new JLabel(imageIcon);
        backgorund.setBounds(40, 40, 506, 560);
        this.getContentPane().add(backgorund);
        this.getContentPane().repaint();


    }

    private void initJMenuBar() {
        JMenuBar jMenuBar = new JMenuBar();
        //创建
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建item


        //添加到JMenu中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //给条目绑定事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);

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
        //给整个键盘添加监听事件
        this.addKeyListener(this);
        //添加计数功能


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            this.getContentPane().removeAll();
            ImageIcon imageIcon = new ImageIcon("D:\\01 文件和材料\\102 Java_study\\puzzlegame\\image\\all\\A0233321.png");
            JLabel allJLabel = new JLabel(imageIcon);
            allJLabel.setBounds(83, 134, 420, 420);
            this.getContentPane().add(allJLabel);

            ImageIcon imageIcon1 = new ImageIcon("D:\\01 文件和材料\\102 Java_study\\puzzlegame\\image\\background\\ABD19194-83F6-423d-99F1-09BA92719AA6.png");
            JLabel backgorund = new JLabel(imageIcon1);
            backgorund.setBounds(40, 40, 506, 560);
            this.getContentPane().add(backgorund);
            this.getContentPane().repaint();
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (victory()) {
            return;
        }
        int code = e.getKeyCode();
        if (code == 37) {
            if (y == 3) {
                return;
            }
            data[x][y] = data[x][y + 1];
            data[x][y + 1] = 0;
            y++;
            step++;
            initImage();
        } else if (code == 38) {
            if (x == 3) {
                return;
            }
            data[x][y] = data[x + 1][y];
            data[x + 1][y] = 0;
            x++;
            step++;
            initImage();
        } else if (code == 39) {
            if (y == 0) {
                return;
            }
            data[x][y] = data[x][y - 1];
            data[x][y - 1] = 0;
            y--;
            step++;
            initImage();
        } else if (code == 40) {
            if (x == 0) {
                return;
            }
            data[x][y] = data[x - 1][y];
            data[x - 1][y] = 0;
            x--;
            step++;
            initImage();
        } else if (code == 65) {
            initImage();
        } else if (code == 87) {
            data = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16},
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        if (object == replayItem){
            //初始化步数
            step = 0;
            initData();
            initImage();

        } else if (object == reLoginItem) {
            this.setVisible(false);
            new LoginJFrame();
        } else if (object == closeItem) {
            System.exit(0);
        } else if (object == accountItem) {
            JDialog jDialog = new JDialog();
            JLabel jLabel = new JLabel(new ImageIcon("D:\\01 文件和材料\\102 Java_study\\puzzlegame\\image\\background\\349F5734-369A-4f69-95C1-C7300260657C.png"));
            jLabel.setBounds(0,0,244,244);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344,344);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            jDialog.setVisible(true);


        }
    }
}
