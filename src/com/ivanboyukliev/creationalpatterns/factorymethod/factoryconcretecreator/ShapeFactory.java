package com.ivanboyukliev.creationalpatterns.factorymethod.factoryconcretecreator;

public class ShapeFactory {

    // use getShape method to get an object of type Shape
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
