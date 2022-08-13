package com.github.panarik.javaLesson.lessons.patterns.structure.facade;

public class FacadePatternExample {

    public static void main(String[] args) {

        // Login.
        BankAccountFacade bank = new BankAccountFacade(12345678, 1234);

        // Withdraw user action.
        bank.withdrawCash(100);

        // Deposit user action.
        bank.depositCash(5000);

    }




}
