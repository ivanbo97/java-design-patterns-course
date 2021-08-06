package com.ivanboyukliev.creationalpatterns.prototype.courseassignment;

public class PrototypePatternClient {

    public static void main(String[] args) {
        BasicCarCache.loadCache();

        BasicCar fordCar = BasicCarCache.getCar("1");
        System.out.println("Got car with type: " + fordCar.model + ", Price = " + fordCar.getPrice());
    }
}
