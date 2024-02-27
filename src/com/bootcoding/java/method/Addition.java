package com.bootcoding.java.method;

public class Addition {

    public static int addition(int num1, int num2){
         int add = num1 +num2;
         return add;
    }

    public  static  int multiplication(int num1, int num2){
        int mul = num1 *num2;
        return mul;
    }

    public  static  int substraction(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }

    public  static  int division(int num1, int num2){
        int div = num1 / num2;
        return div;
    }
    public static void main(String[] args) {
       int result= addition(2,3);
       int sub = substraction(10,5);
       int mul = multiplication(5, 2);
       int div = division(10 , 5);

        System.out.println("addtion of two numbers is : " + result);
        System.out.println("substraction of two numbers is : " + sub);
        System.out.println("multiplication of two numbers is : " + mul);
        System.out.println("divison of two numbers is : " + div);

    }
}
