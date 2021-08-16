package com.ivanboyukliev.behavioralpatterns.state;

public class OffState extends RemoteControl {
    @Override
    public void pressSwitch(Tv context) {
        System.out.println("I am Off. Going to be On now");
        context.setState(new OnState());
    }
}
