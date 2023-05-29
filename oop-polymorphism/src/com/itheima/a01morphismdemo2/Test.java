package com.itheima.a01morphismdemo2;

public class Test {
    public static void main(String[] args) {
   /*     Person person1 = new Person();
        Dog dog = new Dog(2,"黑");
        person1.setName("老王");
        person1.setAge(30);
        person1.keepPet(dog,"骨头");*/

        Person person1 = new Person("老王",30);
        Animal animal = new Dog(2,"黑");
        person1.keepPet(animal,"骨头");


       /* Person person2 = new Person("老李",25);
        Cat cat = new Cat(3,"灰");
        person2.keepPet(cat,"鱼");*/
    }
}
