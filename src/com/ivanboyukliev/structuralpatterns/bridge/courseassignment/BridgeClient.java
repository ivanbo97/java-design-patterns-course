package com.ivanboyukliev.structuralpatterns.bridge.courseassignment;

public class BridgeClient {
    public static void main(String[] args) {
        IColor colorFirst = new Red();
        Shape firstShape = new Triangle(colorFirst);
        firstShape.drawShape(25);

        IColor colorSecond = new Green();
        Shape secondShape = new Rectangle(colorSecond);
        secondShape.drawShape(25);
    }
}
