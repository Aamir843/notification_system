package org.nagarro.notification.channels;

import org.nagarro.notification.interfaces.NotificationChannel;

public class EmailNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String subject, String message) {
        System.out.println("Sending notification via EMail - Subject: " + subject + ", Message: " + message);
    }
}

