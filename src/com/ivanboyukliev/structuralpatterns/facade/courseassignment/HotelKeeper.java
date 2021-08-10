package com.ivanboyukliev.structuralpatterns.facade.courseassignment;

public class HotelKeeper {
    public VegMenu getVegMenu(){
        VegRestaurant vegRestaurant = new VegRestaurant();
        VegMenu vegMenu = (VegMenu) vegRestaurant.getMenus();
        return vegMenu;
    }

    public NonVegMenu getNonVegMenu(){
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();
        NonVegMenu vegMenu = (NonVegMenu) nonVegRestaurant.getMenus();
        return vegMenu;
    }
    public Both getVegNonMenu(){
        VegNonBothRestaurant vegNonBothRestaurant = new VegNonBothRestaurant();
        Both bothMenu = (Both)vegNonBothRestaurant.getMenus();
        return bothMenu;
    }
}
