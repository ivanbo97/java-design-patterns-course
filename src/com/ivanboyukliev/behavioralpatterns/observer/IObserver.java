package com.ivanboyukliev.behavioralpatterns.observer;

public interface IObserver {
    void update();

    // attach with subject to observer, not required, but added so that the
    // observer can query the subject to see if any update has occurred
    void setSubject(ISubject subject);
}
