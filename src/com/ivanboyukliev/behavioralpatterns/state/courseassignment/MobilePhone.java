package com.ivanboyukliev.behavioralpatterns.state.courseassignment;

// Context
public class MobilePhone {
    private MobilePhoneState phoneState;

    public MobilePhone(MobilePhoneState phoneState) {
        this.phoneState = phoneState;
    }

    public void setPhoneState(MobilePhoneState phoneState) {
        this.phoneState = phoneState;
    }

    public void alert(){
        phoneState.alert();
    }
}
