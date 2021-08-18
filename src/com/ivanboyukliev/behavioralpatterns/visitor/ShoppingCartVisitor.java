package com.ivanboyukliev.behavioralpatterns.visitor;

public interface ShoppingCartVisitor {
    float visit(Book book);
    float visit(Fruit fruit);
}
