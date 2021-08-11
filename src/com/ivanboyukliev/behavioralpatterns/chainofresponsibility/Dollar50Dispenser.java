package com.ivanboyukliev.behavioralpatterns.chainofresponsibility;

public class Dollar50Dispenser implements DispenseChain {
    private DispenseChain nextDispenser;

    @Override
    public void setNextChain(DispenseChain nextElementInChain) {
        this.nextDispenser = nextElementInChain;
    }

    @Override
    public void dispense(Currency currency) {
        int currencyAmount = currency.getAmount();
        if (currencyAmount >= 50) {
            int num = currencyAmount / 50;
            int reminder = currencyAmount % 50;
            System.out.println("Dispensing " + num + " 50$ note");
            if (reminder != 0) {
                this.nextDispenser.dispense(new Currency(reminder));
            }
            return;
        }
        this.nextDispenser.dispense(currency);
    }
}
