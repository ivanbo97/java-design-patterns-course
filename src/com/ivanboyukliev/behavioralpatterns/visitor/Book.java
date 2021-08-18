package com.ivanboyukliev.behavioralpatterns.visitor;

public class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    @Override
    public float accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }
}
