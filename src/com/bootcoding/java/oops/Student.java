package com.bootcoding.java.oops;

public class Student {
    String name;
    int age;

    public Student(){

    }

    public Student(String name , int age ){
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Nish";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Komal";
        s2.age = 20;

        Student s3 = new Student("Sakshi", 20);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
    }
}
