package com.itheima.args;

public class A01_Args {
    public static void main(String[] args) {

        /*
        * JDK5
        * 可变参数
        * 方法形参个数是可以发生变化的，0 1 2 3 4 5...
        * 形式：属性类型...名字
        * int...args
        * */
        int sum = getSum(1, 2, 3, 4, 5, 6);
        System.out.println(sum);
    }


    //底层
    //可变参数底层是一个数组
    //只不过不需要我们自己创建，Java会帮我们创建好
    public static int getSum(int...args){
        //System.out.println(args); //[I@4eec7777
        int sum = 0;
        for (int i : args) {

            sum = sum + i;

        }
        return sum;

    }
}
