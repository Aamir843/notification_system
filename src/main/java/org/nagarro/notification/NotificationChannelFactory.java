package org.nagarro.notification;

public class NotificationChannelFactory {
    public static NotificationChannel createChannel(String channelType) {
        switch (channelType) {
            case "Email":
                return new EmailNotificationChannel();
            case "SMS":
                return new SMSNotificationChannel();
            default:
                throw new IllegalArgumentException("Invalid channel type: " + channelType);
        }
    }
}

