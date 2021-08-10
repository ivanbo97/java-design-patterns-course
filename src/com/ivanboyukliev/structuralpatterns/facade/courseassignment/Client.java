package com.ivanboyukliev.structuralpatterns.facade.courseassignment;

public class Client {
    public static void main(String[] args) {
        HotelKeeper hotelKeeper = new HotelKeeper();

        VegMenu vegMenu = hotelKeeper.getVegMenu();
        NonVegMenu nonVegMenu = hotelKeeper.getNonVegMenu();
        Both bothMenus = hotelKeeper.getVegNonMenu();
    }
}
