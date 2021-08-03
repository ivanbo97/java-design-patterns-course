package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public class Client {
    public static void main(String[] args) {
        System.out.println("*****************MEAL BUILDER******************");

        MealBuilder vegBuilder = new VegMealBuilder();
        Director director = new Director();
        director.construct(vegBuilder);
        vegBuilder.getMeal().showItems();

        MealBuilder nonVegMeal = new NonVegMealBuilder();
        director.construct(nonVegMeal);
        nonVegMeal.getMeal().showItems();

    }
}
