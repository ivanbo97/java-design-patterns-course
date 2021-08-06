package com.ivanboyukliev.structuralpatterns.adapter.example2;

public class Client {
    public static void main(String[] args) {
        System.out.println("* * * Adapter Pattern Demo * * *");

        Triangle triangle = new Triangle(20,10);

        CalculatorInterface calculatorAdapter = new CalculatorAdapter(triangle);
        System.out.println("Area of the triangle is " + calculatorAdapter.getArea(null));
    }
}
