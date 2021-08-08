package com.ivanboyukliev.structuralpatterns.bridge.courseassignment;

public class Rectangle extends Shape {

    protected Rectangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("Drawing rectangle shape with border " + border);
    }

    @Override
    void modifyBorders(int border, int increment) {
        System.out.println("Modifying rectangle borders with " + increment);
    }
}
