package com.ivanboyukliev.behavioralpatterns.templatemethod.courseassignemnt;

public class Client {
    public static void main(String[] args) {
        OrderProcessTemplate order = new NetOrder();
        order.processOrder();
    }

}
