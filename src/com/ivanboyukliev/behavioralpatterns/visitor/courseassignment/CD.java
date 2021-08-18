package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

public class CD implements ItemForShipping {
    private float price;
    private float weight;

    public CD(float price, float weight) {
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
