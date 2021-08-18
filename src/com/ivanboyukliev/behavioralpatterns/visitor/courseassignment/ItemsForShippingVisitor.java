package com.ivanboyukliev.behavioralpatterns.visitor.courseassignment;

public interface ItemsForShippingVisitor {
    void visit(Book item);

    void visit(DVD item);

    void visit(CD item);
}
