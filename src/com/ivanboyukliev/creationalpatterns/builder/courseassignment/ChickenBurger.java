package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class ChickenBurger extends Burger {
    @Override
    public float getPrice() {
        return (float)5.50;
    }

    @Override
    public String getName() {
        return "Chicken King";
    }
}
