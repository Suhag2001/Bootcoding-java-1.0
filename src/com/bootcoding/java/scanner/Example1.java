package com.bootcoding.java.scanner;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
//        //input as age

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
        System.out.println("Enter your bike price :");
        double bikePrice = sc.nextDouble();
        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);


        System.out.println("Your age is : " + age);
        System.out.println("Your name is : " + name);
        System.out.println("Your bike price is : " + bikePrice);
        System.out.println("Your gender is : " + gender);


    }
}
