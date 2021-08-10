package com.ivanboyukliev.structuralpatterns.flyweight;

// Flyweight interface - for setting extrinsic data

public interface RobotInterface {
    void print();
    // setter for extrinsic data
    void setColor(String color);
}
