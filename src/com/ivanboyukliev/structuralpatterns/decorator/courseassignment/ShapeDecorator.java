package com.ivanboyukliev.structuralpatterns.decorator.courseassignment;

// Abstract Decorator - should contain reference to component
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
}
