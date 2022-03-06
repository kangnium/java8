package com.technologies.interfaceenhancement.defaultmethod;

public class Car implements VehicleJava7 {

    public static void main(String[] a){
        Car car = new Car();
        car.details();
        car.mileage();
    }

    @Override
    public void details() {

    }

    @Override
    public void mileage() {

    }
}
