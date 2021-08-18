package com.ivanboyukliev.behavioralpatterns.templatemethod;

public abstract class HouseTemplate {
    // template method, final - no overriding in subclasses
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    // default implementation, hook method
    private void buildWindows(){
        System.out.println("Building Glass Windows");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation(){
        System.out.println("Building foundation with cement, iron and sand");
    }
}
