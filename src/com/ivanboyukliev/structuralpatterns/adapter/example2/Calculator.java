package com.ivanboyukliev.structuralpatterns.adapter.example2;

public class Calculator implements CalculatorInterface {
    @Override
    public double getArea(Rectangle r) {
        return r.getLength() * r.getWidth();
    }
}
