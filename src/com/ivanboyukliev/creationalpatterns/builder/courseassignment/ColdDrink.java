package com.ivanboyukliev.creationalpatterns.builder.courseassignment;

public abstract class ColdDrink implements MenuItem{

    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
