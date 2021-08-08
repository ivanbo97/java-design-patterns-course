package com.ivanboyukliev.structuralpatterns.bridge;

//RefinedAbstraction
public class Produce extends Workshop {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
