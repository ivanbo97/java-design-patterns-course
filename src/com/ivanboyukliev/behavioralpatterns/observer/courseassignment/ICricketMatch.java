package com.ivanboyukliev.behavioralpatterns.observer.courseassignment;

// Subject interface
public interface ICricketMatch {
    void registerMatchViewer(ICricketViewer cricketViewer);

    void unregisterMatchViewer(ICricketViewer cricketViewer);

    void notifyMatchViewers();
}
