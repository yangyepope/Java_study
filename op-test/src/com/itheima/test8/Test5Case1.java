package com.itheima.test8;

public class Test5Case1 {
    public static void main(String[] args) {


        String str1 = "abcde";
        String str2 = "ABC";
//        String rorate;
        for (int i = 0; i < str1.length(); i++) {
            str1 = rorate(str1);
            if (str1.equals(str2)){
//                System.out.println(str1);
                System.out.println(true);
                break;
            } else if (i == str1.length() - 1) {
                System.out.println(false);
            }


        }



    }



    public static String rorate(String str){
        String first = str.substring(0,1);
        String end = str.substring(1);
        String result = end + first;
        return result;
    }
}
