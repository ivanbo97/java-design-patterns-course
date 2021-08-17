package com.ivanboyukliev.behavioralpatterns.strategy;

public class Client {
    public static void main(String[] args) {
        PaymentStrategy paypalStrategy = new PaypalStrategy("i@asd.com","************");

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1c23",200);
        Item item2= new Item("1c23as",300);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(paypalStrategy);

    }
}
