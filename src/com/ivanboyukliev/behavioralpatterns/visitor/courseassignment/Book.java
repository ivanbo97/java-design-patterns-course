package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

public class Book implements ItemForShipping {
    private float price;
    private float weight;

    public Book(float price, float weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public void accept(ItemsForShippingVisitor visitor) {
        visitor.visit(this);
    }

    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }
}
