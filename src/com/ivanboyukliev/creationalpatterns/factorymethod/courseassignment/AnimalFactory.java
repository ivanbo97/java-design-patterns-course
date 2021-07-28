package com.ivanboyukliev.creationalpatterns.factorymethod.courseassignment;

public class AnimalFactory {

    public Animal getAnimalType(String animalType){

       if(animalType == null) {
           return null;
       }
        if(animalType.equalsIgnoreCase("DUCK")){
            return new Duck();
        }
        if(animalType.equalsIgnoreCase("TIGER")){
            return new Tiger();
        }

        return null;
    }
}
