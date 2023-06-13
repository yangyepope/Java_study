package com.itheima.args;

public class A02_Args {
    public static void main(String[] args) {


        /*
        * 可变参数小细节
        * 1. 在方法的形参中最多只能写一个可变参数
        * 2. 在方法当中，如果除了可变参数以外，还有其他的形参，那么可变参数要写在最后
        * */
        getSum(1,1,2,3,4);



    }
    public static int getSum(int a,int...args){
        return 0;
    }
}
