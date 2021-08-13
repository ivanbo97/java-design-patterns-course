package com.ivanboyukliev.behavioralpatterns.iterator;

public class NotificationIterator implements Iterator {
    private Notification[] notificationList;

    // maintain current position of iterator in the array
    private int currentPosition = 0;

    public NotificationIterator(Notification[] notificationList) {
        this.notificationList = notificationList;
    }

    @Override
    public boolean hasNext() {
        if (currentPosition >= notificationList.length || notificationList[currentPosition] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Notification nextNotification = notificationList[currentPosition];
        currentPosition++;
        return nextNotification;
    }
}
