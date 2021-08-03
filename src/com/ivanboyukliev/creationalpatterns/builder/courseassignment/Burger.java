package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public abstract class Burger implements MenuItem{

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }
}
