package com.ivanboyukliev.behavioralpatterns.observer.courseassignment;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class ConcreteCricketMatch implements ICricketMatch {
    private List<ICricketViewer> matchViewers;
    private CricketMatchState cricketMatchState;
    private boolean matchStateChanged;

    public ConcreteCricketMatch() {
        matchViewers = new ArrayList<>();
        matchStateChanged = false;
    }

    @Override
    public void registerMatchViewer(ICricketViewer cricketViewer) {
        if (cricketViewer == null) {
            throw new NullPointerException("Match viewer is null.");
        }
        if (!matchViewers.contains(cricketViewer)) {
            matchViewers.add(cricketViewer);
        }
    }

    @Override
    public void unregisterMatchViewer(ICricketViewer cricketViewer) {
        matchViewers.remove(cricketViewer);
    }

    @Override
    public void notifyMatchViewers() {
        if (!matchStateChanged) {
            System.out.println("There is no new information to notify viewers.");
            return;
        }
        for (ICricketViewer matchViewer : matchViewers) {
            matchViewer.update(cricketMatchState);
        }
    }

    public void updateMatchState(CricketMatchState matchState) {
        this.cricketMatchState = matchState;
        this.matchStateChanged = true;
        notifyMatchViewers();
    }
}
