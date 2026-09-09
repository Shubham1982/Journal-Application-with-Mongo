package com.journalapplication.journal_application.newpackagetesting.fuctionalinterface;

public class AdditionOfElement {
    public static void main(String[] args) {

        SumInterface sum = (a,b) ->{
            System.out.println(a + b);
        };

        sum.additionOfElement(5,6);
    }
}
