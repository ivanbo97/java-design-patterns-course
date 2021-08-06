package com.ivanboyukliev.creationalpatterns.prototype.courseassignment;

public class Ford extends BasicCar {

    public Ford() {
        model = "Focus";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
