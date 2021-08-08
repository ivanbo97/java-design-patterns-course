package com.ivanboyukliev.structuralpatterns.bridge.courseassignment;

public class Green extends IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Filling shape with green color, border : " + border);
    }
}
