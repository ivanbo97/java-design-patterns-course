package com.ivanboyukliev.creationalpatterns.abstractfactorymethod;

/*This design is not following the Interface Segregation Principle - class may need to implement
  only one of the methods, the other would be blank (it is done only for simplifying the example) */

public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shapeType);
}


class ShapeFactory extends AbstractFactory {

    @Override
    Shape getShape(String shapeType) {
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

    @Override
    Color getColor(String color) {
        // Attention : We do not follow the Interface Segragation Principle (here is the 'design smell')
        return null;
    }

}

class ColorFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        if (color == null)
            return null;

        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }

        if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;

    }

    @Override
    Shape getShape(String shapeType) {
        // Attention !!! : We do not follow the Interface Segregation Principle (here is the 'design smell')
        return null;
    }

}
