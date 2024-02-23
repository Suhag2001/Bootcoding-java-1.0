package com.bootcoding.java.loop.forloop;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        for(int num = 36; num >= 1; num--){
          fact =  fact * num;
        }
        System.out.println("factorial of given number : " + fact);
    }
}
