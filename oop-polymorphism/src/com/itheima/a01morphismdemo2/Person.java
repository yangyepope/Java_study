package com.itheima.a01morphismdemo2;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   /* public void keepPet(Dog dog,String something){
        System.out.println("年龄为" + this.age +"的"+ this.name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的🐕" );
        dog.eat(something);
    }


    public void keepPet(Cat cat,String something){
        System.out.println("年龄为" + this.age +"的"+ this.name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的🐱" );
        cat.eat(something);
    }*/


    public void keepPet(Animal animal,String something){
        if (animal instanceof Dog dog){
            System.out.println("年龄为" + this.age +"的"+ this.name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "岁的🐕" );
            dog.eat(something);
        } else if (animal instanceof  Cat cat) {
            System.out.println("年龄为" + this.age +"的"+ this.name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "岁的🐱" );
            cat.eat(something);
        }else {
            System.out.println("不存在这种动物");
        }
    }
}
