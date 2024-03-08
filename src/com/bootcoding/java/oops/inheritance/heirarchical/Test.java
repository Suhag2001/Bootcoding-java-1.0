package com.bootcoding.java.oops.inheritance.heirarchical;





class Animal{
    public void eat(){
        System.out.println("eating...");
    }
}

class Dog extends Animal{
    public void bark() {
        System.out.println("barking...");
    }
}

class Cat extends Animal{
    public void meow(){
        System.out.println("meowing...");
    }

}


public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        
    }
}
