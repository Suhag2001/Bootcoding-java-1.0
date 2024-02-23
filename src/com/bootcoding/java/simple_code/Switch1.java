package com.bootcoding.java.simple_code;

public class Switch1 {

  public static void main(String[] args) {

    int dayNumber = 4;

    switch (dayNumber) {

      case 1:
        System.out.println("Monday");
       // break;
      case 2:
        System.out.println("Tuesday");
        //break;
      case 3:
        System.out.println("Wed");
        //break;
      case 4:
        System.out.println("Thur");
       // break;
      case 5:
        System.out.println("Frie");
        //break;
      case 6:
        System.out.println("Sat");
        break;
      case 7:
        System.out.println("Sun");
        break;
      default:
        System.out.println("Invalid day");
    }

  }
}