package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<ItemForShipping> items = new ArrayList<>();

        CD cd1 = new CD(252.45f,0.25f);
        CD cd2 = new CD(28.75f,0.65f);

        DVD dvd1 = new DVD(45.2f,4.45f);
        DVD dvd2 = new DVD(85.4f,4.85f);

        Book book1 = new Book(74.25f,10.4f);
        Book book2 = new Book(14.88f,10.8f);

        items.add(cd1);
        items.add(cd2);
        items.add(dvd1);
        items.add(dvd2);
        items.add(book1);
        items.add(book2);

        ItemsForShippingVisitor visitor = new USVisitor();
        for (ItemForShipping item : items){
            item.accept(visitor);
        }

        System.out.println("Item cost in US:" + ((USVisitor)visitor).getTotalCost());

    }
}
