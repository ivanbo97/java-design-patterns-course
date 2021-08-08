package com.ivanboyukliev.structuralpatterns.bridge;

public class BridgeClient {
    public static void main(String[] args) {
        Vehicle vehicleOne = new Car(new Produce(),new Assemble());
        vehicleOne.manufacture();

        Vehicle vehicleTwo = new Bike(new Produce(),new Assemble());
        vehicleTwo.manufacture();

    }
}
