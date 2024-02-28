package com.bootcoding.java.array;

public class Example2 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        int[] numbers2 = new int[5];  //by default 0

        System.out.println("length of numbers2 : " + numbers2.length); //5

        numbers2[0] = 5;
        numbers2[1] = 4;
        numbers2[2] = 3;
        numbers2[3] = 2;

        for (int i = 0; i < numbers2.length; i++) {
            int num = numbers2[i];
            System.out.println(num);
        }


//        int[] number3 = new int[]{1,2,3,4,5};


    }
}
