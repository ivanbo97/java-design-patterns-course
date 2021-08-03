package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class Coke extends ColdDrink {
    @Override
    public float getPrice() {
        return (float)2.55;
    }

    @Override
    public String getName() {
        return "Standard Coke";
    }
}
