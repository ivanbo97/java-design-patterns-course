package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

import java.util.LinkedList;
import java.util.List;

public class Meal {

    List<MenuItem> mealComponents;

    public Meal() {
        mealComponents = new LinkedList<>();
    }

    public void addItem(MenuItem menuItem) {
        ((LinkedList<MenuItem>) mealComponents).addLast(menuItem);
    }

    public float getTotalCost() {
        float cost = 0;
        for (MenuItem item : mealComponents) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {
        System.out.println("Meal Items are as follow:");
        for (int i = 0; i < mealComponents.size(); i++){
            MenuItem currentItem = mealComponents.get(i);
            System.out.println(i+1 + ". " + currentItem.getName() + ", Packing: " +
                    currentItem.getPacking().pack() + ", Price: " + currentItem.getPrice());
        }
        System.out.println("Total cost: " + getTotalCost());
    }
}
