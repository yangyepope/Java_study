package com.itheima.a01oopextendsdemo2;

public class Test {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.ziShow();
    }

}

class Fu{
        String name = "Fu";
        String hobby = "喝茶";
    }

    class Zi extends Fu {
        String name = "Zi";
        String game = "吃鸡";
        public void ziShow(){
//            String name = "ziShow";
            System.out.println(hobby);
            System.out.println(this.name);
            System.out.println(this.hobby);
            System.out.println(super.name);
            System.out.println(super.hobby);
        }
    }

