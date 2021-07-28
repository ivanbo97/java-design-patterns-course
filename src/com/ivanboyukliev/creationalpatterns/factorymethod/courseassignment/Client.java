package com.ivanboyukliev.creationalpatterns.factorymethod.courseassignment;

public class Client {

    public static void main(String[] args) {
        AnimalFactory animalFactorty = new AnimalFactory();

        try {
            Animal firstAnimal = animalFactorty.getAnimalType("Tiger");
            firstAnimal.makeSound();

            Animal secondAnimal = animalFactorty.getAnimalType(null);
            secondAnimal.makeSound();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
