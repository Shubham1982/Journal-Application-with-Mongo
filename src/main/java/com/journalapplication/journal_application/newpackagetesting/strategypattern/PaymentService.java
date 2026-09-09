package com.journalapplication.journal_application.newpackagetesting.strategypattern;

public class PaymentService {

    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(Double amount){
        paymentStrategy.makePayemnt(amount);
    }
}
