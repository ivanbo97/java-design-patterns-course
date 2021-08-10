package com.ivanboyukliev.structuralpatterns.flyweight;

// ConcreteFlyweight
public class Robot implements RobotInterface{
    private String robotType;
    // Extrinsic data should not be stored in Robot class. This is only for test purposes.
    private String colorOfRobot;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    @Override
    public void setColor(String color) {
        this.colorOfRobot = color;
    }

    @Override
    public void print() {
        System.out.println("This is a " + robotType + " type with " + colorOfRobot + " color");
    }

}
