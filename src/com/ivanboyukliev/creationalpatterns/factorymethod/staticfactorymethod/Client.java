package com.ivanboyukliev.creationalpatterns.factorymethod.staticfactorymethod;

public class Client {

    public static void main(String[] args) {
        Shape firstShape = ShapeFactory.getShape("Square");
        firstShape.draw();

        Shape secondShape = ShapeFactory.getShape("Circle");
        secondShape.draw();

        Shape thirdShape = ShapeFactory.getShape("Rectangle");
        thirdShape.draw();
    }
}
