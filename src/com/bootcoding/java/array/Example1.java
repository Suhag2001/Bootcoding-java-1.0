package com.bootcoding.java.array;

public class Example1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //fixed in size

        numbers[0] = 11;

        int a = numbers[0];

        int b = numbers[9];

        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            System.out.println(num);
        }

        char[] alphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};

        for (int i = 0; i < alphabets.length; i++) {
            char num = alphabets[i];  //typecasting
            System.out.println(num);
        }

        System.out.println(numbers[10]);
    }
}
