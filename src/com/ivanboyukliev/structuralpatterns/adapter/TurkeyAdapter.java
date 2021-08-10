package com.ivanboyukliev.structuralpatterns.adapter;

// Making the turkey behave like duck (but having the characteristics of a turkey)

public class TurkeyAdapter implements Duck {
    //Adaptee
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
