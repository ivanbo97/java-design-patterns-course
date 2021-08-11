package com.ivanboyukliev.behavioralpatterns.chainofresponsibility;

public class Dollar10Dispenser implements DispenseChain {
    private DispenseChain nextDispenser;

    @Override
    public void setNextChain(DispenseChain nextElementInChain) {
        nextDispenser = nextElementInChain;
    }

    @Override
    public void dispense(Currency currency) {
        int currencyAmount = currency.getAmount();
        if (currencyAmount >= 10) {
            int num = currencyAmount / 10;
            int reminder = currencyAmount % 10;
            System.out.println("Dispensing " + num + " 10$ note");
            if (reminder != 0) {
                this.nextDispenser.dispense(new Currency(reminder));
            }
            return;
        }
        this.nextDispenser.dispense(currency);
    }
}
