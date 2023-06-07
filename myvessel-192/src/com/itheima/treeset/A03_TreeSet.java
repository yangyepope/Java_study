package com.itheima.treeset;



import java.util.Comparator;
import java.util.TreeSet;

public class A03_TreeSet {
    public static void main(String[] args) {

        /*
        * 需求：请自行选择比较器排序和自然排序两种方式
        * 要求：
        *    存入4个字符串，如： "c"、"ab"、"df"、"qwe"
        *     按照长度排序，如果一样长则按照首字母排序
        *
        * */




        //o1:表示当前要添加的元素
        //o2:表示已经在红黑树存在的元素
        //返回规则跟之前一样
        // 比较器
        TreeSet<String> treeSet = new TreeSet<>((o1,o2) -> {
                int i = o1.length() - o2.length();
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
        }
        );

        treeSet.add("c");
        treeSet.add("ab");
        treeSet.add("df");
        treeSet.add("qwe");

        System.out.println(treeSet);
    }
}
