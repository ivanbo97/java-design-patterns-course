package com.ivanboyukliev.creationalpatterns.factorymethod.courseassignment;

public class AnimalFactory {

    public Animal getAnimalType(String animalType) throws Exception {

        if (animalType == null) {
            throw new Exception("Null was provided as a method parameter.");
        }
        if (animalType.equalsIgnoreCase("DUCK")) {
            return new Duck();
        }
        if (animalType.equalsIgnoreCase("TIGER")) {
            return new Tiger();
        }

        throw new Exception("Can not instantiate object of type " + animalType);
    }
}
