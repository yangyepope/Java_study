package com.itheima.a02integerdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (sum <= 200) {
            System.out.println("请输入一个整数");
            int line = scanner.nextInt();
            arrayList.add(line);
            sum = sum + line;
        }
    }
}
