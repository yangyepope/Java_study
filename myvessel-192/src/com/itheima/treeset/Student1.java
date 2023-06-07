package com.itheima.treeset;

import java.util.Comparator;

public class Student1 implements Comparable<Student1> {

    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student1() {
    }

    public Student1(String name, int age, int chinese, int english, int math) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return chinese
     */
    public int getChinese() {
        return chinese;
    }

    /**
     * 设置
     *
     * @param chinese
     */
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     *
     * @return english
     */
    public int getEnglish() {
        return english;
    }

    /**
     * 设置
     *
     * @param english
     */
    public void setEnglish(int english) {
        this.english = english;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    public String toString() {
        return "Student1{name = " + name + ", age = " + age + ", chinese = " + chinese + ", english = " + english + ", math = " + math + "}";
    }


    @Override
    public int compareTo(Student1 o) {

        /*
         *   * 需求：创建五个学生对象
         * 属性：姓名、年龄、语文成绩、数学成绩、英语成绩
         * 按照总分从高到低输出到控制台
         * 如果总分一样，按照语文成绩排序
         * 如果语文成绩一样，按照数学成绩排序
         * 如果数学成绩一样，按照英语成绩排序
         * 如果英语成绩一样，按照年龄排序
         * 如果年龄一样，按照姓名的字母排序
         * 如果都一样，认为是同一个学生，不存
         * */
        int sum = this.getChinese() + this.getMath() + this.getEnglish();
        int sum1 = o.getChinese() + o.getMath() + o.getEnglish();
        int i = sum - sum1;
        i = i == 0 ? this.getChinese() - o.getChinese() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;
        i = i == 0 ? this.getEnglish() - o.getEnglish() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
