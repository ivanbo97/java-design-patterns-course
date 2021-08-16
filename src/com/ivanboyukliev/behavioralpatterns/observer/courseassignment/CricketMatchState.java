package com.ivanboyukliev.behavioralpatterns.observer.courseassignment;

// Utility class for storing match data
public class CricketMatchState {
    private int runs;
    private int overs;
    private int wickets;

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getOvers() {
        return overs;
    }

    public void setOvers(int overs) {
        this.overs = overs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public String toString() {
        return "*** STATE OF CRICKET MATCH***\n 1.runs : " + runs + "\n2.wickets : " + wickets + "\n3.overs : " + overs;
    }
}
