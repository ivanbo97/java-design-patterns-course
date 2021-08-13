package com.ivanboyukliev.behavioralpatterns.iterator;

public class NotificationBar {
    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications) {
        this.notifications = notifications;
    }

    // helper for the client - for test purposes
    public void printNotifications() {
        Iterator iterator = notifications.createIterator();
        System.out.println("---------Notifications Bar------------");
        while (iterator.hasNext()) {
            Notification notification = (Notification) iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
