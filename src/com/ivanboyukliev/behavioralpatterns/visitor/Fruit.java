package com.ivanboyukliev.behavioralpatterns.visitor;

public class Fruit implements ItemElement {
    private float price;
    private float wight;
    private String name;

    public Fruit(float price, float wight, String name) {
        this.price = price;
        this.wight = wight;
        this.name = name;
    }

    @Override
    public float accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public float getPrice() {
        return price;
    }

    public float getWight() {
        return wight;
    }

    public String getName() {
        return name;
    }
}
