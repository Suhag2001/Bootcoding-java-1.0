package com.bootcoding.java.method;

import java.util.Scanner;

public class Example1 {

    public static int addition(int a, int b ){
       return  a+b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2  = sc.nextInt();


       int add = addition(num1,num2);

        System.out.println("Addition of two Number : "  + add);

    }
}
