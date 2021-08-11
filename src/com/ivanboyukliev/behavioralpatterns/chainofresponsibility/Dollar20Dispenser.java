package com.ivanboyukliev.behavioralpatterns.chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain {
    private DispenseChain nextDispenser;

    @Override
    public void setNextChain(DispenseChain nextElementInChain) {
        nextDispenser = nextElementInChain;
    }

    @Override
    public void dispense(Currency currency) {
        int currencyAmount = currency.getAmount();
        if (currencyAmount >= 20) {
            int num = currencyAmount / 20;
            int reminder = currencyAmount % 20;
            System.out.println("Dispensing " + num + " 20$ note");
            if (reminder != 0) {
                this.nextDispenser.dispense(new Currency(reminder));
            }
            return;
        }
        this.nextDispenser.dispense(currency);
    }
}
