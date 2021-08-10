package com.ivanboyukliev.structuralpatterns.decorator.courseassignment;

public class ShapeDecoratorClient {
    public static void main(String[] args) {
        System.out.println("* * * Decorator Design Pattern * * *");
        Shape circle = new Circle();
        Shape shapeDecorator = new RedShapeDecorator(circle);
        shapeDecorator.draw();
        System.out.println("=========================");
        Shape rectangle = new Rectangle();
        Shape greenShapeDecorator = new GreenShapeDecorator(rectangle);
        greenShapeDecorator.draw();
    }
}
