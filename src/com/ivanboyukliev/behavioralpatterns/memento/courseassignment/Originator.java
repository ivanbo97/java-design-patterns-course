package com.ivanboyukliev.behavioralpatterns.memento.courseassignment;

public class Originator {
    private String state;

    public Originator(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveCurrentState() {
        return new Memento(state);
    }

    public void restoreToState(Object obj) {
        Memento memento = (Memento) obj;
        this.state = memento.state;
    }


    private class Memento {
        String state;

        public Memento(String state) {
            this.state = state;
        }
    }
}
