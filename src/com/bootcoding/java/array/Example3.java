package com.bootcoding.java.array;

public class Example3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            System.out.println(num);
        }
    }
}
