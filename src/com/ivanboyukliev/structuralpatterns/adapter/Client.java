package com.ivanboyukliev.structuralpatterns.adapter;

public class Client {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says: ......");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe duck says: .....");
        testDuck(mallardDuck);

        System.out.println("\nThe turkey adapter says: .......");
        testDuck(turkeyAdapter);
    }

    static void testDuck (Duck duck){
        duck.quack();
        duck.fly();
    }
}
