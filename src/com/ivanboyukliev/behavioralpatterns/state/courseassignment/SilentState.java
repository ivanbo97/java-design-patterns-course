package com.ivanboyukliev.behavioralpatterns.state.courseassignment;

public class SilentState implements MobilePhoneState {
    @Override
    public void alert() {
        System.out.println("The phone is in silent state.");
    }
}
