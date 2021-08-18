package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

public class USVisitor implements ItemsForShippingVisitor {
    private float totalCost;

    @Override
    public void visit(Book item) {
        if (item.getPrice() < 20) {
            totalCost += item.getWeight() * 2;;
        }
    }

    @Override
    public void visit(DVD item) {
        if (item.getPrice() < 20) {
            totalCost += item.getWeight() * 3;
        }

    }

    @Override
    public void visit(CD item) {
        if (item.getPrice() < 20) {
            totalCost += item.getWeight() * 2.5f;
        }
    }

    public float getTotalCost() {
        return totalCost;
    }
}
