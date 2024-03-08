package com.bootcoding.java.string;

public class Example1 {
    public static void main(String[] args) {

        String clgName = "KDK College";

        String revClgName  ="";

//        char[] charOfStr =  str.toCharArray();
//
//        for (int i = 0 ; i< charOfStr.length; i++){
//            System.out.println(charOfStr[i]);
//        }
//
//        for (int i = 0 ; i< clgName.length(); i++){
//           char temp =  clgName.charAt(i);
//            System.out.println(temp);
//        }

        for (int i = clgName.length() - 1; i >= 0; i--) {
            char temp = clgName.charAt(i);
            revClgName = revClgName +temp;
//            System.out.println(temp);
        }


        System.out.println(revClgName);

    }
}
