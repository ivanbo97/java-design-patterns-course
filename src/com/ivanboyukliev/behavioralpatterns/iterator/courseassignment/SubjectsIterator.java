package com.ivanboyukliev.behavioralpatterns.iterator.courseassignment;

public interface SubjectsIterator {
    // reset to first element
    void first();
    String next();
    boolean isDone();
    String currentItem();
}
