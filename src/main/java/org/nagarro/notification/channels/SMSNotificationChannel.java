package org.nagarro.notification.channels;

import org.nagarro.notification.interfaces.NotificationChannel;

public class SMSNotificationChannel implements NotificationChannel {
    @Override
    public void sendNotification(String subject, String message) {
        System.out.println("Sending nottification via SMS - Subject: " + subject + ", Message: " + message);
    }
}

