package com.ivanboyukliev.behavioralpatterns.state;

// Concrete State
public class OnState extends RemoteControl {
    @Override
    public void pressSwitch(Tv context) {
        System.out.println("I am already On. Going to be Off now");
        context.setState(new OffState());
    }
}
