package com.ivanboyukliev.structuralpatterns.bridge.courseassignment;

public class Red extends IColor {
    @Override
    public void fillWithColor(int border) {
        System.out.println("Filling shape with red color and border : " + border);
    }
}
