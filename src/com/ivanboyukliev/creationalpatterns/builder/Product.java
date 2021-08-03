package com.ivanboyukliev.creationalpatterns.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {

    private List<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void add(String partRepresentation) {
        ((LinkedList) parts).addLast(partRepresentation);
    }

    public void show() {
        System.out.println("Product includes the following parts:");
        for (String part : parts) {
            System.out.println(part);
        }

    }
}
