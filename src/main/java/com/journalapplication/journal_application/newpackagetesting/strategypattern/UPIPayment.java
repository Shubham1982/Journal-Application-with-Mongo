package com.journalapplication.journal_application.newpackagetesting.strategypattern;

public class UPIPayment implements PaymentStrategy{

    @Override
    public void makePayemnt(Double amount) {
        System.out.println("UPI Payment done" + amount);
    }
}
