package com.ivanboyukliev.structuralpatterns.bridge;

public class Bike extends Vehicle {
    public Bike(Workshop wk1, Workshop wk2) {
        super(wk1, wk2);
    }

    @Override
    public void manufacture() {
        System.out.println("Bike");
        workshopOne.work();
        workshopTwo.work();
    }
}
