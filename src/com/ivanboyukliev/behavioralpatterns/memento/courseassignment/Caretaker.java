package com.ivanboyukliev.behavioralpatterns.memento.courseassignment;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Object> savedOriginatorStates;

    public Caretaker() {
        savedOriginatorStates = new ArrayList<>();
    }

    public void addNewState(Object newState) {
        savedOriginatorStates.add(newState);
    }

    public Object getOriginatorState(int numOfState) {
        return savedOriginatorStates.get(numOfState);
    }


}
