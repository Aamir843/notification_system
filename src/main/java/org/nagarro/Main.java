package org.nagarro;

import org.nagarro.notification.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("User1");
        User user2 = new User("User2");

        NotificationService notificationService = NotificationService.getInstance();
        notificationService.addObserver(user1);
        notificationService.addObserver(user2);

        String channelType="";
        Scanner sc = new Scanner(System.in);

        System.out.println("Please select the channel for notification. Enter 1 for Email or 2 for SMS");
        int input = sc.nextInt();
        sc.nextLine();

        if (input == 1) {
            channelType = "Email";
        }
        if (input == 2) {
            channelType = "SMS";
        }

        System.out.println("Please write the subject:");
        String subject = sc.nextLine();

        System.out.println("Please write the message:");
        String message = sc.nextLine();


        // Factory to create channel
        NotificationChannel channel = NotificationChannelFactory.createChannel(channelType);

        // Adapter to adapt NotificationChannel to NotificationService
        NotificationAdapter adapter = new NotificationAdapter(channel);

        // Facade to send notification
        NotificationSender sender = new NotificationSender(adapter);
        sender.sendNotification(subject, message);

        // Send notification to the subscribed users
        notificationService.notifyObservers("New notification: " + subject + " - " + message);
    }

}