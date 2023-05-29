package com.itheima.a01jdk7datademo1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入0-100之间任意的整数");
            String line = scanner.nextLine();
            int strNum = Integer.parseInt(line);
            if (strNum < 1 || strNum > 100) {
                System.out.println("请输入正确的数");
                continue;

            }
            list.add(strNum);
            int sum = getSum(list);
            if (sum >= 200){
                for (int i = 0; i < list.size(); i++) {
                    System.out.println(list.get(i));
                }
//                System.out.println(sum);
                break;
            }


        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            //list.get(i)自动拆箱
            sum = sum + list.get(i);
        }
        return sum;
    }
}
