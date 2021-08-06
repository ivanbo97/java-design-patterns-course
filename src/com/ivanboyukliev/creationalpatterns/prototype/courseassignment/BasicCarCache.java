package com.ivanboyukliev.creationalpatterns.prototype.courseassignment;

import java.util.Hashtable;

public class BasicCarCache {
    private static Hashtable carCache = new Hashtable();

    public static BasicCar getCar(String carId) {
        return (BasicCar) carCache.get(carId);
    }

    public static void loadCache() {
        BasicCar fordCar = new Ford();
        fordCar.setPrice(25000f);
        carCache.put("1", fordCar);

        BasicCar nanoCar = new Nano();
        nanoCar.setPrice(10000f);
        carCache.put("2", nanoCar);
    }
}
