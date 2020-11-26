package com;


public class Student {
    private int age;
    public String name;


    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public static void main(String[] args) {
        Student st = new Student(25, "Son");
        System.out.println(st.age);
    }
}
