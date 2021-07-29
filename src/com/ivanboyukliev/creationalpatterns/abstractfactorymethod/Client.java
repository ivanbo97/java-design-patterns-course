package com.ivanboyukliev.creationalpatterns.abstractfactorymethod;

public class Client {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape firstShape = shapeFactory.getShape("Circle");
        firstShape.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color desiredColor = colorFactory.getColor("Red");
        desiredColor.fill();
    }
}
