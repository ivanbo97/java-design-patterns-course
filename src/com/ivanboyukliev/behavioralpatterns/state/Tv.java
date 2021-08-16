package com.ivanboyukliev.behavioralpatterns.state;

// Context class
public class Tv {
    //Reference to current state
    private RemoteControl state;

    public Tv(RemoteControl state) {
        this.state = state;
    }

    public RemoteControl getState() {
        return state;
    }

    public void setState(RemoteControl state) {
        this.state = state;
    }

    public void pressButton(){
        state.pressSwitch(this);
    }
}
