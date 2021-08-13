package com.ivanboyukliev.behavioralpatterns.iterator.courseassignment;

import java.util.List;

public class ScienceSubjectsIterator implements SubjectsIterator {
    private List<String> scienceSubjects;
    private int currentPosition = 0;

    public ScienceSubjectsIterator(List<String> scienceSubjects) {
        this.scienceSubjects = scienceSubjects;
    }

    @Override
    public void first() {
        currentPosition = 0;
        System.out.println("Current subject is: " + scienceSubjects.get(currentPosition));
    }

    @Override
    public String next() {
        return scienceSubjects.get(currentPosition++);
    }

    @Override
    public boolean isDone() {
        if (currentPosition >= scienceSubjects.size() - 1) {
            System.out.println("You have reached the last science subject.");
            return true;
        }
        return false;
    }

    @Override
    public String currentItem() {
        return scienceSubjects.get(currentPosition);
    }
}
