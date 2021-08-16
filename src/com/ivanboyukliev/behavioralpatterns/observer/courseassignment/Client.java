package com.ivanboyukliev.behavioralpatterns.observer.courseassignment;

public class Client {
    public static void main(String[] args) {
        ConcreteCricketMatch cricketMatch = new ConcreteCricketMatch();

        ICricketViewer averageScoreViewer = new AverageScore();
        ICricketViewer currentScoreViewer = new CurrentScore();

        cricketMatch.registerMatchViewer(averageScoreViewer);
        cricketMatch.registerMatchViewer(currentScoreViewer);

        CricketMatchState matchState = new CricketMatchState();
        matchState.setRuns(250);
        matchState.setOvers(14);
        matchState.setWickets(25);
        cricketMatch.updateMatchState(matchState);
    }
}
