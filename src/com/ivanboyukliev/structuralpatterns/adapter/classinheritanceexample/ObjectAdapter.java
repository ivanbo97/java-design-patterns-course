package com.ivanboyukliev.structuralpatterns.adapter.classinheritanceexample;

public class ObjectAdapter {
    // Adaptee
    private IntegerValueInterface myInt;

    public ObjectAdapter(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    public int getInteger(){
        return 2 + myInt.getIntger();
    }
}
