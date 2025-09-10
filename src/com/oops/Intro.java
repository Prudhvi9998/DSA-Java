package com.oops;

public class Intro {
    public static void main(String[] args) {
//        Student student;

    Student student1 = new Student();
//    student1.rno = 13;
//    student1.name = "Prudhvi";
//    student1.marks = 85;
        student1.changeName("kunal");
        System.out.println(student1.rno);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        student1.greeting();
        System.out.println(student1.getClass());
    }
}

class Student{
    int rno;
    String name;
    float marks = 95.5f;
    void changeName(String name){
        this.name = name;
    }
    void greeting(){
        System.out.println("Hello my name is " + name);
    }
    Student(){
        this.rno = 12;
        this.name = "Prudhvi";
        this.marks = 75f;
    }
}
