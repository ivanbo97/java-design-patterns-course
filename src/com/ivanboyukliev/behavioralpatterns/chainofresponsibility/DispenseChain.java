package com.ivanboyukliev.behavioralpatterns.chainofresponsibility;

// Handler
public interface DispenseChain {
    void setNextChain(DispenseChain nextElementInChain);
    void dispense(Currency currency);
}
