package com.ivanboyukliev.behavioralpatterns.chainofresponsibility.courseassignment;

public class IssueRaiser {
    public IReceiver firstReceiver;

    public IssueRaiser(IReceiver firstReceiver) {
        this.firstReceiver = firstReceiver;
    }

    public void raiseMessage(Message message){
        if(firstReceiver != null){
            firstReceiver.processMessage(message);
        }
    }
}
