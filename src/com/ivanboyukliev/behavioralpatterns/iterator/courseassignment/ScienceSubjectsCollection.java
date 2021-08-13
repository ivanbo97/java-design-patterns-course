package com.ivanboyukliev.behavioralpatterns.iterator.courseassignment;

import java.util.LinkedList;
import java.util.List;

public class ScienceSubjectsCollection implements ISubjectCollection {
    private List<String> subjects;
    public static final int MAX_SUBJECTS = 6;

    public ScienceSubjectsCollection() {
        subjects = new LinkedList<>();
        populateWithSubjects();
    }

    @Override
    public SubjectsIterator createSubjectsIterator() {
        return new ScienceSubjectsIterator(subjects);
    }

    private void populateWithSubjects(){
        subjects.add("Chemistry");
        subjects.add("Programming");
        subjects.add("Cosmology");
        subjects.add("Pharmacy");
    }
}
