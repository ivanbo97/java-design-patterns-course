package com.ivanboyukliev.behavioralpatterns.iterator;

// Aggregate - defines interface for creating iterator object
public interface Collection {
    Iterator createIterator();
}
