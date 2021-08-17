package com.ivanboyukliev.behavioralpatterns.strategy.courseassignment;

public class Context {
    public void executeOperation(MathOperation mathOperation, int a, int b){
        mathOperation.performOperation(a,b);
    }
}
