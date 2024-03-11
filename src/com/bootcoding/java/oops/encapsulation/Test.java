package com.bootcoding.java.oops.encapsulation;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setName("Akshay");
        s1.setEmail("akshay@gmail.com");
        s1.setRollNumber(123);

        System.out.println("Student Name : " + s1.getName());
        System.out.println("Student Email : " + s1.getEmail());
        System.out.println("Student Roll Number : " + s1.getRollNumber());

        Student s2 = new Student();

        s2.setName("Shahrukh");
        s2.setEmail("shahrukh@gmail.com");
        s2.setRollNumber(125);

        System.out.println("Student Name : " + s2.getName());
        System.out.println("Student Email : " + s2.getEmail());
        System.out.println("Student Roll Number : " + s2.getRollNumber());

        System.out.println(    s2.toString());

    }
}
