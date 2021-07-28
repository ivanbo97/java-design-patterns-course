package com.ivanboyukliev.creationalpatterns.factorymethod.courseassignment;

public interface Animal {
    void makeSound();
}


class Tiger implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Tiger makes sound: Roarr!!!");
    }
}


class Duck implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Duck makes sound: Quaaack!!!");
    }
}

