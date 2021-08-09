package com.ivanboyukliev.structuralpatterns.decorator;

public class ConcreteDecoratorEx_2 extends AbstractDecorator {
    @Override
    public void doJob() {
        super.doJob();

        // Additional responsibility

        System.out.println("Explicitly from Ex_2");
        System.out.println("***End. Ex_2");
    }
}
