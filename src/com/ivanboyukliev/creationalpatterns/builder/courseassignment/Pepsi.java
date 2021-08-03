package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class Pepsi extends ColdDrink {
    @Override
    public float getPrice() {
        return (float)1.50;
    }

    @Override
    public String getName() {
        return "Standard Pepsi";
    }
}
