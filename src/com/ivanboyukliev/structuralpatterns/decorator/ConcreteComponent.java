package com.ivanboyukliev.structuralpatterns.decorator;

public class ConcreteComponent extends Component {
    @Override
    public void doJob() {
        System.out.println("I am from a Concrete component - I am closed for modification!");
    }
}
