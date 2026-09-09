package com.journalapplication.journal_application.newpackagetesting.strategypattern;

public class PaymentMainClass {
    public static void main(String[] args) {
        PaymentStrategy paymentService = new NEFTPayment();

        PaymentService payment = new PaymentService(paymentService);

        payment.pay(1000.0);

    }



}
