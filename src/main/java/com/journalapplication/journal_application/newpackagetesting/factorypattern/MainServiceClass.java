package com.journalapplication.journal_application.newpackagetesting.factorypattern;

public class MainServiceClass {
    public static void main(String[] args) {

        Notification notification = NotificationFactory.getNotification("sms");
        notification.send("This is first mail");
    }
}