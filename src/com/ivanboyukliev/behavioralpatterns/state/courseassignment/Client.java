package com.ivanboyukliev.behavioralpatterns.state.courseassignment;

public class Client {
    public static void main(String[] args) {
        MobilePhoneState vibrationState = new SilentState();
        MobilePhone mobilePhone = new MobilePhone(vibrationState);
        System.out.println("Initial phone state: ");
        mobilePhone.alert();
        System.out.println("Changing phone state...");
        mobilePhone.setPhoneState(new VibrationState());
        mobilePhone.alert();
    }
}
