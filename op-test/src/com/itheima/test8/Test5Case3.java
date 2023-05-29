package com.itheima.test8;

public class Test5Case3 {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "bcdefa";
        boolean flag = check(str1,str2);
        System.out.println(flag);
    }



    public static String rotate(String str){
        char[] arr = str.toCharArray();
         char first = arr[0];
        for (int i = 1; i < str.length(); i++) {
             arr[i - 1]= arr[i];
        }
        arr[arr.length - 1] = first;
        String result = new String(arr);
        return result;
    }

    public static boolean check(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
           str1 = rotate(str1);
            System.out.println(str1);
           if (str1.equals(str2)){
               return true;
           }
        }
        return false;
    }

}
