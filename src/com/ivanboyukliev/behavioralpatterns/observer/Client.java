package com.ivanboyukliev.behavioralpatterns.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        IObserver observer1 = new ConcreteObserver("Observer1");
        IObserver observer2 = new ConcreteObserver("Observer2");
        IObserver observer3 = new ConcreteObserver("Observer3");
        IObserver observer4 = new ConcreteObserver("Observer4");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        subject.registerObserver(observer3);
        subject.registerObserver(observer4);

        // attach observer to subject (not required, could have passed in subject state to update method)
        observer1.setSubject(subject);
        observer2.setSubject(subject);
        observer3.setSubject(subject);
        observer4.setSubject(subject);

        // check if any update is available
        observer1.update();

        subject.postMessage("New message");
        subject.notifyObservers();
        subject.postMessage("Newest message");
    }
}
