package com.itheima.test8;

public class Test4 {
    public static void main(String[] args) {
        String str = changeRoma("9");
        System.out.println(str);
    }


    public static String changeRoma(String str){
        String[] roma = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        int i = str.charAt(0) - 48;
        return roma[i];
    }
}
