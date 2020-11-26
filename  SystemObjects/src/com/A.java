package com;

public class A {
    static  int a  = 5;
    void method(int x, int y) {
        x = 5;
        y = 5;
    }

    public static void main(String[] args) {
        A o = new A();
        int x = 1, y = 1;
        o.method(x, y);
        System.out.printf("x=%d, y=%d", x, y);
    }
    class B {
        a = 6;
    }
}
