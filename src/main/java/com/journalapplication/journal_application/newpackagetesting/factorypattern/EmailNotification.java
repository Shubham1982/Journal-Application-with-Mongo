package com.journalapplication.journal_application.newpackagetesting.factorypattern;

import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending email: "+ message);
    }
}
