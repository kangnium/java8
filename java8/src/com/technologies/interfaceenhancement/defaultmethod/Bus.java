package com.technologies.interfaceenhancement.defaultmethod;

public class Bus implements VehicleJava8 {

    void show(){
        Bus b = new Bus();
        b.details();
    }

    @Override
    public void details() {

    }
}
