package com.ivanboyukliev.structuralpatterns.bridge;

//RefinedAbstraction
public class Assemble extends Workshop {
    @Override
    public void work() {
        System.out.println("And Assembled");
    }
}
