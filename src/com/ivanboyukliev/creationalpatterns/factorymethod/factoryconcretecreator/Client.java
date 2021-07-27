package com.ivanboyukliev.creationalpatterns.factorymethod.factoryconcretecreator;

public class Client {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape firstShape = shapeFactory.getShape("circle");
        firstShape.draw();

        Shape secondShape = shapeFactory.getShape("rectangle");
        secondShape.draw();

        Shape thirdShape = shapeFactory.getShape("square");
        thirdShape.draw();
    }
}
