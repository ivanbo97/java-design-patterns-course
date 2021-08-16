package com.ivanboyukliev.behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {
    private List<IObserver> observers;
    private String message;
    private boolean changed;

    public ConcreteSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observerObj) {
        if (observerObj == null) {
            throw new NullPointerException("Observer is null");
        }
        if (!observers.contains(observerObj)) {
            observers.add(observerObj);
        }
    }

    @Override
    public void unregisterObserver(IObserver observerObj) {
        observers.remove(observerObj);
    }

    @Override
    public void notifyObservers() {
        if (!changed) {
            System.out.println("There isn't any new data.");
            return;
        }
        // Create a copy of current list of observers
        // in order to avoid any race conditions
        List<IObserver> currentObservers = this.observers;
        for (IObserver observer : currentObservers) {
            observer.update();
        }
        changed = false;
    }

    @Override
    public Object getUpdate(IObserver observerObj) {
        return this.message;
    }

    // method to post message to the topic, change state (trigger notifications)
    public void postMessage(String message) {
        this.message = message;
        this.changed = true;
        notifyObservers();
    }
}
