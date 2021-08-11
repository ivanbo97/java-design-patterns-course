package com.ivanboyukliev.structuralpatterns.flyweight.courseassignment;

// ConcreteFlyweight
public class CounterTerrorist implements Player {
    // Extrinsic data is stored here only for test purposes. Normally it should be
    // stored by the client!!!!
    private String weapon;

    @Override
    public void mission() {
        System.out.print("DIFFUSE BOMB");
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
        System.out.print("Counter terrorist with weapon " + weapon);
        }
        }
