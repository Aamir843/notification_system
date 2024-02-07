package org.nagarro.notification;

public class EmailNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String subject, String message) {
        System.out.println("Sending notification via EMail - Subject: " + subject + ", Message: " + message);
    }
}

