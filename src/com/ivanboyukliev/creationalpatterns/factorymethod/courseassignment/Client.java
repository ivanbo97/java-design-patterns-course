package com.ivanboyukliev.creationalpatterns.factorymethod.courseassignment;

public class Client {

    public static void main(String[] args) {
        AnimalFactory animalFactorty = new AnimalFactory();

        Animal firstAnimal = animalFactorty.getAnimalType("Duck");
        firstAnimal.makeSound();

        Animal secondAnimal = animalFactorty.getAnimalType("Tiger");
        secondAnimal.makeSound();
    }
}
