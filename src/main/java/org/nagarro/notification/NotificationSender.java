package org.nagarro.notification;

public class NotificationSender {
    private final NotificationAdapter adapter;

    public NotificationSender(NotificationAdapter adapter) {
        this.adapter = adapter;
    }

    public void sendNotification(String subject, String message) {
        adapter.sendNotification(subject, message);
    }
}

