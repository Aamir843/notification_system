package org.nagarro.notification.services;

public class NotificationSender {
    private final NotificationAdapter adapter;

    public NotificationSender(NotificationAdapter adapter) {
        this.adapter = adapter;
    }

    public void sendNotification(String subject, String message) {
        adapter.sendNotification(subject, message);
    }
}

