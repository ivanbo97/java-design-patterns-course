package com.ivanboyukliev.creationalpatterns.factorymethod.strictimplementation;

// Creator
public abstract class AbstractShapeFactory {

    protected abstract Shape factoryMethod();

    public Shape getShape() {
        return factoryMethod();
    }

    //other helper
}

// Concrete Creator
class RectangleFactory extends AbstractShapeFactory {

    @Override
    public Shape factoryMethod() {
        return new Rectangle();
    }
}

// Concrete Creator
class SquareFactory extends AbstractShapeFactory {

    @Override
    public Shape factoryMethod() {
        return new Square();
    }
}

// Concrete Creator
class CircleFactory extends AbstractShapeFactory {

    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
}