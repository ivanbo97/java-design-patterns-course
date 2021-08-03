package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class VegBurger extends Burger {

    @Override
    public float getPrice() {
        return (float) 3.50;
    }

    @Override
    public String getName() {
        return "Veg Beauty";
    }
}
