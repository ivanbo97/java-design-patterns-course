package com.ivanboyukliev.creationalpatterns.builder;

public class Director {

    private BuilderInterface customBuilder;

    public void construct(BuilderInterface builderInterface) {
        customBuilder = builderInterface;
        customBuilder.buildBody();
        customBuilder.insertWheels();
        customBuilder.addHeadlights();
    }
}
