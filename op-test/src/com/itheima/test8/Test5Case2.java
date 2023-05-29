package com.itheima.test8;

public class Test5Case2 {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ABC";
        boolean res = check(str1,str2);
        System.out.println(res);
    }




    public static String rorate(String str){
        String first = str.substring(0,1);
        String end = str.substring(1);
        String result = end + first;
        return result;
    }

    public static boolean check(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            str1 = rorate(str1);
            if (str1.equals(str2)){
                return true;
            }
        }
        return false;
    }
}
