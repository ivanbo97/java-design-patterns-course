package com.ivanboyukliev.behavioralpatterns.observer;

public interface ISubject {
    void registerObserver(IObserver observerObj);

    void unregisterObserver(IObserver observerObj);

    void notifyObservers();

    Object getUpdate(IObserver observerObj);
}
