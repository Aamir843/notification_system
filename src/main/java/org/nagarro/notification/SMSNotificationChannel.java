package org.nagarro.notification;

public class SMSNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String subject, String message) {
        System.out.println("Sending SMS - Subject: " + subject + ", Message: " + message);
    }
}

