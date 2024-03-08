package com.bootcoding.java.oops.inheritance.multilevel;




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

class BabyDog extends Dog{
    public void weep(){
        System.out.println("weeping...");
    }
}
public class Test {
    public static void main(String[] args) {

        BabyDog babyDog = new BabyDog();

        babyDog.eat();
        babyDog.bark();
        babyDog.weep();


    }
}
