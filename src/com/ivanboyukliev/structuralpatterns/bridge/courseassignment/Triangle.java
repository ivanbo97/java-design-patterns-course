package com.ivanboyukliev.structuralpatterns.bridge.courseassignment;

public class Triangle extends Shape {
    protected Triangle(IColor color) {
        super(color);
    }

    @Override
    void drawShape(int border) {
        System.out.println("Drawing triangle shape with color : ");
        color.fillWithColor(border);
    }

    @Override
    void modifyBorders(int border, int increment) {
        System.out.println("Modifying triangle borders! Incrementing with " + increment);
    }
}
