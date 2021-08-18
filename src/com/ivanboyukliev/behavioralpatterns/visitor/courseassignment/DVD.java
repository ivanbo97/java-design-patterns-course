package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

public class DVD implements ItemForShipping {
    private float price;
    private float weight;

    public DVD(float price, float weight) {
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
