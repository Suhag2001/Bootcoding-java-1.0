package com.bootcoding.java.method;

import java.util.Scanner;

class Method{
    public static int calculation(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int sum = calculation(a,b);
        System.out.println(sum);
    }
}