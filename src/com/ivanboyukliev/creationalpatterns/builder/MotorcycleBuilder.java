package com.ivanboyukliev.creationalpatterns.builder;

public class MotorcycleBuilder implements BuilderInterface {

    private Product product = new Product();

    @Override
    public void buildBody() {
        product.add("This is a body of a motorcycle");
    }

    @Override
    public void insertWheels() {
        product.add("Two wheels are added!");
    }

    @Override
    public void addHeadlights() {
        product.add("One headlight was added!");
    }

    @Override
    public Product getVehicle() {
        return product;
    }
}
