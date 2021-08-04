package com.ivanboyukliev.creationalpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShapeFirst = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + clonedShapeFirst.getType());


        Shape conedShapeFirst = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape : " + conedShapeFirst.getType());


        Shape clonedShapeSecond = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShapeSecond.getType());

        Shape clonedShapeThird = (Shape) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShapeThird.getType());
    }
}
