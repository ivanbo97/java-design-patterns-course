package com.ivanboyukliev.structuralpatterns.adapter.classinheritanceexample;


public class ClassAdapter extends IntegerValue {
    @Override
    public int getIntger() {
        return 2 + super.getIntger();
    }
}
