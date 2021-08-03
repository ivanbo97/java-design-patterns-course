package com.ivanboyukliev.creationalpatterns.builder;

public class Client {
    public static void main(String[] args) {
        System.out.println("************Builder Pattern Demo*************");

        Director director = new Director();
        BuilderInterface carBuilder = new CarBuilder();
        BuilderInterface motorcycleBuilder = new MotorcycleBuilder();

        director.construct(carBuilder);
        Product productFirst = carBuilder.getVehicle();
        productFirst.show();

        director.construct(motorcycleBuilder);
        Product productSecond = motorcycleBuilder.getVehicle();
        productSecond.show();

    }
}
