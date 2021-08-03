package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
