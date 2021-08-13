package com.ivanboyukliev.behavioralpatterns.iterator.courseassignment;

public class Client {
    public static void main(String[] args) {
        ISubjectCollection artSubjectCollection = new ArtSubjectsCollection();
        SubjectsIterator iterator = artSubjectCollection.createSubjectsIterator();
        while(!iterator.isDone()){
            System.out.println(iterator.next());
        }
    }
}
