package com.ivanboyukliev.creationalpatterns.factorymethod.strictimplementation;

// Product
public interface Shape {
    void draw();
}

// Product Implementation
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

// Product Implementation
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

// Product Implementation
class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}