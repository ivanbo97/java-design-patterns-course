package com.ivanboyukliev.creationalpatterns.factorymethod.strictimplementation;

/**
 *
 */

public class Client {

    public static void main(String[] args) {

        Shape firstShape = new CircleFactory().getShape();
        firstShape.draw();

        Shape secondShape = new RectangleFactory().getShape();
        secondShape.draw();

        Shape thirdShape = new SquareFactory().getShape();
        thirdShape.draw();
    }
}
