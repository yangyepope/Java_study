package com.itheima.search;

public class A01_BasicSearchDemo4 {
    public static void main(String[] args) {

        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};

        Block b1 = new Block(21, 0, 5);
        Block b2 = new Block(45, 6, 11);
        Block b3 = new Block(73, 12, 17);

        Block[] arrayBlock = {b1, b2, b3};

        //定义一个变量用于记录需要查找的元素


        System.out.println(basicSearch(arrayBlock, arr, 73));

//        int block = getBlock();
    }

    private static int basicSearch(Block[] arrayBlock, int[] arr, int number) {
        int index = getBlock(arrayBlock, number);
        if (index == -1){
            return -1;
        }

        int startIndex = arrayBlock[index].getStartIndex();

        int endIndex = arrayBlock[index].getEndIndex();
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {

                return i;
            }
        }
        return -1;
    }

    private static int getBlock(Block[] arrayBlock, int number) {
        for (int i = 0; i < arrayBlock.length; i++) {
            if (arrayBlock[i].getMax() >= number) {
                return i;
            }
        }
        return -1;
    }
}


class Block {
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}


