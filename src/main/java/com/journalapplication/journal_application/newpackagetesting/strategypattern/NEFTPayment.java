package com.journalapplication.journal_application.newpackagetesting.strategypattern;

public class NEFTPayment implements PaymentStrategy{
    @Override
    public void makePayemnt(Double amount) {
        System.out.println("NEFT payment done: "+ amount);
    }
}
