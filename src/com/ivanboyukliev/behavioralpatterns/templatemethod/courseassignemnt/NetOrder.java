package com.ivanboyukliev.behavioralpatterns.templatemethod.courseassignemnt;

public class NetOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Item is added to online cart.");
    }

    @Override
    public void doPayment() {
        System.out.println("Items were paid using paypal.");
    }

    @Override
    public void deliver() {
        System.out.println("Items will be delivered by post.");
    }
}
