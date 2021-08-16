package com.ivanboyukliev.behavioralpatterns.observer;

public class ConcreteObserver implements IObserver {
    private String name;

    // It is not required
    private ISubject topic;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        // Implement it in a pull style : observer is querying
        // subject to see if there any updates
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println("No new message on this topic");
            return;
        }
        System.out.println(name + "Consuming message : " + msg);
    }

    @Override
    public void setSubject(ISubject subject) {
        // Not required, added so observer can ask subject for state
        this.topic = subject;
    }
}
