package com.ivanboyukliev.structuralpatterns.adapter.classinheritanceexample;

//Adaptee
public class IntegerValue implements IntegerValueInterface {
    @Override
    public int getIntger() {
        return 5;
    }
}
