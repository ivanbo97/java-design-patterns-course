package com.ivanboyukliev.behavioralpatterns.chainofresponsibility.courseassignment;

public interface IReceiver {
    boolean processMessage(Message message);
    void setNextReceiver (IReceiver nextReceiver);
}
