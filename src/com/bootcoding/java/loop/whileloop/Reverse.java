package com.bootcoding.java.loop.whileloop;

public class Reverse {
    public static void main(String[] args) {




        int num = 121;
        int temp = num;
        int rev = 0 ;
        while(num != 0){
             int last = num % 10;
            rev = (rev * 10)+ last;
           num = num /10;
        }

        System.out.println("Reverse a given number :" + rev);

        if(temp==rev){
            System.out.println("given number is palindrome number");
        }else{
            System.out.println("given number is not a palindrome number");
        }
    }
}
