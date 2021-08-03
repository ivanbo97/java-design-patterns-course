package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class Director {


    public void construct(MealBuilder mealBuilder){
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
    }
}
