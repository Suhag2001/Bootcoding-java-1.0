package com.bootcoding.java.oops.polymorphism;

public class Parent {

    //method overloading
    public int addition(int a, int b ){
        int add = a + b;
        return add;
    }

    public int addition(int a , int b ,int c){
        int add = a + b +c;
        return add;
    }
    public int addition(int a , int b ,int c,int d){
        int add = a + b +c +d;
        return add;
    }
    public int addition(int a , int b ,int c,int d , int e){
        int add = a + b +c +d +e;
        return add;
    }

    public static void main(String[] args) {

        Parent p = new Parent();
        System.out.println(p.addition(10,20));
        System.out.println(p.addition(10,20,30));
        System.out.println(p.addition(10,20,30,40));


    }
}
