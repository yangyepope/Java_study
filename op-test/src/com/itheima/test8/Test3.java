package com.itheima.test8;

import java.util.Scanner;
import java.util.StringJoiner;

public class Test3 {
    public static void main(String[] args) {


        StringJoiner sj = new StringJoiner(", ","[","]");
        Scanner sc = new Scanner(System.in);
        while (true){
            String str =  getString(sc);
            boolean flag = checkStr(str);

            if (flag){
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    String result= changeRoma(c);
                        sj.add(result);

                }
                String s = sj.toString();
                System.out.println(s);
                break;
            }else {
                System.out.println("请重新录入");
//                continue;

            }
        }


    }




    public static String getString(Scanner sc){

        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }

    public static boolean checkStr(String str){
        if (str.length() > 9){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9'){
                return false;
            }

        }
        return true;
    }


    public static String changeRoma(char c){
        String[] roma = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        int i = c - 48;
        return roma[i];
    }

}
