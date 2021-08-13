package com.ivanboyukliev.behavioralpatterns.iterator.courseassignment;

public class ArtSubjectsIterator implements SubjectsIterator {
    private String[] artSubjects;
    private int currentPosition = 0;

    public ArtSubjectsIterator(String[] artSubjects) {
        this.artSubjects = artSubjects;
    }

    @Override
    public void first() {
        currentPosition = 0;
        System.out.println("Current subject is: " + artSubjects[currentPosition]);
    }

    @Override
    public String next() {
        return artSubjects[currentPosition++];
    }

    @Override
    public boolean isDone() {
        if (currentPosition >= ArtSubjectsCollection.MAX_SUBJECTS - 1 || artSubjects[currentPosition] == null) {
            System.out.println("You have reached the last subject in art's department");
            return true;
        }
        return false;
    }

    @Override
    public String currentItem() {
        return artSubjects[currentPosition];
    }
}
