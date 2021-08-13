package com.ivanboyukliev.behavioralpatterns.iterator;

// ConcreteAggregate
public class NotificationCollection implements Collection {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notificationsList;

    public NotificationCollection() {
        notificationsList = new Notification[MAX_ITEMS];
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    private void addItem(String item) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Collection is full");
            return;
        }
        Notification notification = new Notification(item);
        notificationsList[numberOfItems] = notification;
        numberOfItems++;
    }

    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationsList);
    }
}
