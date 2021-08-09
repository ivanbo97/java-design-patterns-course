package com.ivanboyukliev.structuralpatterns.decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        System.out.println("* * * Decorator design pattern Demo * * *");

        Component concreteComponent = new ConcreteComponent();

        ConcreteDecoratorEx_1 concreteDecoratorEx_1 = new ConcreteDecoratorEx_1();

        // Decorate the concrete component with the decorator

        concreteDecoratorEx_1.setComponent(concreteComponent);
        concreteDecoratorEx_1.doJob();

        Component concrComp2 = new ConcreteComponent();
        ConcreteDecoratorEx_2 concreteDecoratorEx_2 = new ConcreteDecoratorEx_2();
        concreteDecoratorEx_2.setComponent(concrComp2);
        concreteDecoratorEx_2.doJob();

    }
}
