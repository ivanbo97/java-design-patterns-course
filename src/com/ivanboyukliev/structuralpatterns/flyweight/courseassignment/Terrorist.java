package com.ivanboyukliev.structuralpatterns.flyweight.courseassignment;

// ConcreteFlyweight
public class Terrorist implements Player {
    // Extrinsic data is stored here only for test purposes. Normally it should be
    // stored by the client!!!!
    private String weapon;

    @Override
    public void mission() {
        System.out.print("PLANT A BOMB");
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
        System.out.print("Terrorist with weapon " + weapon);
    }
}
