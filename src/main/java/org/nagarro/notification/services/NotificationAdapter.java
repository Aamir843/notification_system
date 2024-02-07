package org.nagarro.notification.services;

import org.nagarro.notification.interfaces.NotificationChannel;

public class NotificationAdapter {
    private final NotificationChannel channel;

    public NotificationAdapter(NotificationChannel channel) {
        this.channel = channel;
    }

    public void sendNotification(String subject, String message) {
        channel.sendNotification(subject, message);
    }
}

