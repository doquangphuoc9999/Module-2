package com.codegym;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student st1 = new Student(111, "Hoang");
        Student st2 = new Student(222,"phan");
        Student st3 = new Student(333,"nhan");

        st1.display();
        st2.display();
        st3.display();
    }
}
