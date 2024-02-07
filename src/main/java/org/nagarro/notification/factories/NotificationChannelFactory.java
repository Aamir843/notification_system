package org.nagarro.notification.factories;

import org.nagarro.notification.channels.EmailNotificationChannel;
import org.nagarro.notification.channels.SMSNotificationChannel;
import org.nagarro.notification.interfaces.NotificationChannel;

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

