package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

public class SouthAmericaVisitor implements ItemsForShippingVisitor {
    private float totalCost = 0;

    @Override
    public void visit(Book item) {
        if (item.getPrice() < 30) {
            totalCost += item.getWeight() * 2;
        }

    }

    @Override
    public void visit(DVD item) {
        if (item.getPrice() < 30) {
            totalCost += item.getWeight() * 3;
        }

    }

    @Override
    public void visit(CD item) {
        if (item.getPrice() < 30) {
            totalCost += item.getWeight() * 2.5f;
        }
    }

    public float getTotalCost() {
        return totalCost;
    }
}
