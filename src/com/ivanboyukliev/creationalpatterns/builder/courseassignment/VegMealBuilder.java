package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class VegMealBuilder implements MealBuilder {

    Meal vegMeal = new Meal();

    @Override
    public void buildBurger() {
        MenuItem menuItem = new VegBurger();
        vegMeal.addItem(menuItem);
    }

    @Override
    public void buildDrink() {
        MenuItem menuItem = new Coke();
        vegMeal.addItem(menuItem);
    }

    @Override
    public Meal getMeal() {
        return vegMeal;
    }
}
