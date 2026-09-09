package com.journalapplication.journal_application.newpackagetesting.factorypattern;

import org.springframework.stereotype.Service;


public class NotificationFactory {

    public static Notification getNotification(String notificationType){
        switch(notificationType){
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();

            default:
                throw new RuntimeException("entity not found");
        }
    }

}
