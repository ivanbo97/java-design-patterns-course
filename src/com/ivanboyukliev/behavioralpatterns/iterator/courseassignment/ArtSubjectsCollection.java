package com.ivanboyukliev.behavioralpatterns.iterator.courseassignment;

public class ArtSubjectsCollection implements ISubjectCollection {
    private String [] subjects;
    public static final int MAX_SUBJECTS = 5;

    public ArtSubjectsCollection() {
        subjects = new String[MAX_SUBJECTS];
        populateDefaultSubjects();
    }

    @Override
    public SubjectsIterator createSubjectsIterator() {
        return new ArtSubjectsIterator(subjects);
    }

    private void populateDefaultSubjects(){
        subjects[0] = "Martial arts";
        subjects[1] = "Painting";
        subjects[2] = "Motorcycling";
    }
}
