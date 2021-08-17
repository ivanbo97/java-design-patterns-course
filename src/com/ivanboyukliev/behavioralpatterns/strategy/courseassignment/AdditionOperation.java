package com.ivanboyukliev.behavioralpatterns.strategy.courseassignment;

public class AdditionOperation implements MathOperation {
    @Override
    public void performOperation(int num1, int num2) {
        System.out.println("The result of addition is " + (num1 + num2));
    }
}
