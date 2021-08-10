package com.ivanboyukliev.structuralpatterns.decorator.courseassignment;

public class GreenShapeDecorator extends ShapeDecorator {
     GreenShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        fillWithGreenColor();
    }

    private void fillWithGreenColor(){
        System.out.println("Filling the shape with green color");
    }
}
