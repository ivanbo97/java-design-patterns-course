package com.ivanboyukliev.behavioralpatterns.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public float visit(Book book) {
        System.out.println("BOOK-> ISBN: " + book.getIsbnNumber() + " cost: " + book.getPrice());
        return book.getPrice() > 50 ? book.getPrice() - 5 : book.getPrice();
    }

    @Override
    public float visit(Fruit fruit) {
        System.out.println(fruit.getName() + " cost = " + fruit.getPrice());
        return fruit.getPrice()*fruit.getWight();
    }
}
