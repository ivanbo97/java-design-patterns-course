package com.ivanboyukliev.structuralpatterns.decorator.courseassignment;

// Concrete Component
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
}
