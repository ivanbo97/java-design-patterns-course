package com.ivanboyukliev.behavioralpatterns.observer.courseassignment;

// Concrete observer
public class AverageScore implements ICricketViewer {
    @Override
    public void update(CricketMatchState currentMatchState) {
        int runs = currentMatchState.getRuns();
        int overs = currentMatchState.getOvers();
        float runRate = (float) runs / (float) overs;
        System.out.println("::AVERAGE SCORE DATA:: Run rate -> " + runRate + " Predicted Score -> " + runRate * 50);
    }
}
