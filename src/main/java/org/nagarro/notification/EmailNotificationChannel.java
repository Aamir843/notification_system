package org.nagarro.notification;

public class EmailNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String subject, String message) {
        System.out.println("Sending Email - Subject: " + subject + ", Message: " + message);
    }
}

