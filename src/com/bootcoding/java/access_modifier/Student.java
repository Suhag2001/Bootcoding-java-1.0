package com.bootcoding.java.access_modifier;

public class Student {
   public String bag = "skybag";


   private void study(){

       System.out.println("i'm doing study");
   }

    public static void main(String[] args) {

         Student student = new Student();

        System.out.println("student  :" +student.bag);

    }
}
