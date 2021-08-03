package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class NonVegMealBuilder implements MealBuilder{

    Meal nonVegMeal = new Meal();

    @Override
    public void buildBurger() {
        MenuItem nonVegBurger = new ChickenBurger();
        nonVegMeal.addItem(nonVegBurger);
    }

    @Override
    public void buildDrink() {
        MenuItem nonVegDrink = new Pepsi();
        nonVegMeal.addItem(nonVegDrink);
    }

    @Override
    public Meal getMeal() {
        return nonVegMeal;
    }
}
