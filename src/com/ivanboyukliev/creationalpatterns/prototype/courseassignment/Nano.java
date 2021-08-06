package com.ivanboyukliev.creationalpatterns.prototype.courseassignment;

public class Nano extends BasicCar {

    public Nano() {
        model = "Xyz";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
