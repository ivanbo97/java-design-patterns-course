package com.ivanboyukliev.behavioralpatterns.templatemethod.courseassignemnt;

public abstract class OrderProcessTemplate {

    public final void processOrder() {
        doSelect();
        doPayment();
        giftWrap();
        deliver();
    }

    public final void giftWrap(){
        System.out.println("Gift wrap was successful!");
    }

    public abstract void doSelect();

    public abstract void doPayment();

    public abstract void deliver();
}
