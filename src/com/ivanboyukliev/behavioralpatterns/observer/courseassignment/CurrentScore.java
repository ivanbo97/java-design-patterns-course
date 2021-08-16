package com.ivanboyukliev.behavioralpatterns.observer.courseassignment;

// Concrete Observer
public class CurrentScore implements ICricketViewer {
    @Override
    public void update(CricketMatchState currentMatchState) {
        System.out.println("::: CURRENT SCORE ::" + currentMatchState);
    }
}
