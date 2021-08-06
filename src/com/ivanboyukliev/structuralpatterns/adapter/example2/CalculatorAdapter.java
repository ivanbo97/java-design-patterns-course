package com.ivanboyukliev.structuralpatterns.adapter.example2;

public class CalculatorAdapter implements CalculatorInterface {
    Calculator calculator;
    Triangle triangle;

    public CalculatorAdapter(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public double getArea(Rectangle r) {
        calculator = new Calculator();
        Rectangle rectangle = new Rectangle();

        rectangle.setLength(triangle.getBase());
        rectangle.setWidth(0.5 * triangle.getHeight());

        return calculator.getArea(rectangle);
    }
}
