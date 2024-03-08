package com.bootcoding.java.string;

public class Student {
    int id ;
    String name ;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.id = 10;
        student.name = "Suhag";
        System.out.println(student.toString());

        Student student1 = student;
        System.out.println(student1.toString());
        
        student1.name = "Ankush";
        System.out.println(student.toString());
        System.out.println(student1.toString());
    }
}
