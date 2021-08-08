package com.ivanboyukliev.structuralpatterns.bridge;

public class Car extends Vehicle {
    public Car(Workshop wk1, Workshop wk2) {
        super(wk1, wk2);
    }

    @Override
    public void manufacture() {
        System.out.println("Car");
        workshopOne.work();
        workshopTwo.work();
    }
}
