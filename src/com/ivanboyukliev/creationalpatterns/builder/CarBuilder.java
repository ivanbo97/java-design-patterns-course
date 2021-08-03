package com.ivanboyukliev.creationalpatterns.builder;

public class CarBuilder implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void insertWheels() {
        product.add("Four wheels are added!");
    }

    @Override
    public void addHeadlights() {
        product.add("Two headlights are added!");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
