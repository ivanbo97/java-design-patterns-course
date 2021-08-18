package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

public interface ItemForShipping {
    void accept(ItemsForShippingVisitor visitor);
}
