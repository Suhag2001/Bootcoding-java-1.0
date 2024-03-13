package com.bootcoding.java.oops.polymorphism;

public class Child extends Parent{

    //method overriding
    public int addition(int a, int b ){
        int add = a + b;
        return add;
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.addition(20,30) );;
    }
}
