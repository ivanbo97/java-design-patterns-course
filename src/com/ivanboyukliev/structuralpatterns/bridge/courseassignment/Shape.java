package com.ivanboyukliev.structuralpatterns.bridge.courseassignment;

public abstract class Shape {
    protected IColor color;
    protected Shape(IColor color){
        this.color = color;
    }
    abstract void drawShape(int border);
    abstract void modifyBorders(int border, int increment);
}
