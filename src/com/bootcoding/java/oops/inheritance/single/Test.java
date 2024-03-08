package com.bootcoding.java.oops.inheritance.single;




class Animal{
    public void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("barking...");
    }
}


public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();
        dog.bark();

        Animal animal = new Animal();
        animal.eat();
    }
}
