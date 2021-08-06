package com.ivanboyukliev.creationalpatterns.prototype.courseassignment;

abstract class BasicCar implements Cloneable {

    BasicCar(){
        price = 250.00f;
    }
    protected String model;
    private float price;

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
