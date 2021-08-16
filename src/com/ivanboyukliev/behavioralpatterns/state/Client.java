package com.ivanboyukliev.behavioralpatterns.state;

public class Client {
    public static void main(String[] args) {
        RemoteControl offState = new OffState();
        Tv tvContext = new Tv(offState);

        // First time press
        tvContext.pressButton();

        // Second time press
        tvContext.pressButton();
    }
}
