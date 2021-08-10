package com.ivanboyukliev.structuralpatterns.decorator.courseassignment;

public class RedShapeDecorator extends ShapeDecorator {

     RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        fillWithRedColor();
    }

    private void fillWithRedColor(){
        System.out.println("Filling the shape with red color");
    }
}
