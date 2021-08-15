package com.ivanboyukliev.behavioralpatterns.memento.courseassignment;

public class Client {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator("#1 State");
        caretaker.addNewState(originator.saveCurrentState());

        originator.setState("#2 State");
        caretaker.addNewState(originator.saveCurrentState());

        originator.setState("#3 State");
        caretaker.addNewState(originator.saveCurrentState());

        System.out.println("Current originator: " + originator);

        originator.restoreToState(caretaker.getOriginatorState(1));

        System.out.println("Restored originator: " + originator);

    }
}
