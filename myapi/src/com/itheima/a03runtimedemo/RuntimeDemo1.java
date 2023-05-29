package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        long l = runtime.maxMemory() / 1024 / 1024;
        System.out.println(l);
//        Runtime.getRuntime().exec("notepad");
        Runtime.getRuntime().exec("shutdown -a");
    }
}
