package com.ivanboyukliev.behavioralpatterns.visitor;

import com.ivanboyukliev.behavioralpatterns.strategy.ShoppingCart;

// Element interface
public interface ItemElement {
    float accept(ShoppingCartVisitor visitor);
}
