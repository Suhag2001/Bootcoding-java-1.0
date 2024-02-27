package com.bootcoding.java.method;

public class Factorial {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {

      int result =  factorial(5);

        System.out.println("factorial of 5 is " + result);
    }
}
