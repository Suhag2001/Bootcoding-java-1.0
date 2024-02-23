package com.bootcoding.java.loop.whileloop;

public class Loop3 {
    public static void main(String[] args) {

        int num = 8235;
        int count = 0;
        while(num != 0){
           int last = num % 10;
            System.out.println(last);
           count++;
            num =num/10;
        }

        System.out.println("count of given number is :" + count);
    }
}
