package com.ivanboyukliev.behavioralpatterns.templatemethod.courseassignemnt;

public class StoreOrder extends OrderProcessTemplate {
    @Override
    public void doSelect() {
        System.out.println("Item was picked from the shelf.");
    }

    @Override
    public void doPayment() {
        System.out.println("Items were paid using cash.");
    }

    @Override
    public void deliver() {
        System.out.println("Items will be picked up at counter.");
    }
}
