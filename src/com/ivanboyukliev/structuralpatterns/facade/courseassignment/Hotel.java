package com.ivanboyukliev.structuralpatterns.facade.courseassignment;

public interface Hotel {
    Menus getMenus();
}

class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}

class VegRestaurant implements Hotel {
    public Menus getMenus() {
        VegMenu v = new VegMenu();
        return v;
    }
}

class VegNonBothRestaurant implements Hotel {
    public Menus getMenus() {
        Both b = new Both();
        return b;
    }
}
