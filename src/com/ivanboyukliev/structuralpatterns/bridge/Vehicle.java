package com.ivanboyukliev.structuralpatterns.bridge;

// Abstraction
public abstract class Vehicle {
    //Implementors
    protected Workshop workshopOne;
    protected Workshop workshopTwo;

    protected Vehicle(Workshop workshopOne, Workshop workshopTwo) {
        this.workshopOne = workshopOne;
        this.workshopTwo = workshopTwo;
    }

    abstract public void manufacture();
}
