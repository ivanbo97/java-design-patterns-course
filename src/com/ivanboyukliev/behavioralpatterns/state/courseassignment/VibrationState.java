package com.ivanboyukliev.behavioralpatterns.state.courseassignment;

public class VibrationState implements MobilePhoneState {
    @Override
    public void alert() {
        System.out.println("The phone is in vibration mode.");
    }
}
