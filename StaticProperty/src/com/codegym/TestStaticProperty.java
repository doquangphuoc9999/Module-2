package com.codegym;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCar + " " + car1);

        Car car2 = new Car("Mazda 5","Skyactiv 6");
        System.out.println(Car.numberOfCar + " " + car1);
    }
}

