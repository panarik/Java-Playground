package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.state.states;

public class HasPin implements ATMState {

    // Hold all data from concrete ATM.
    // Pass this ATM throw all states.
    ATM atm;

    public HasPin(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {

    }

    public void ejectCard() {

    }

    public void insertPin(int pinCode) {

    }

    public void requestCash(int cashRequested) {
        if (atm.cashInMachine > cashRequested) {
            System.out.println("Getting " + cashRequested + ".");
            atm.cashInMachine -= cashRequested;
        } else System.out.println("I don't have so much money. Try cash request with less sum.");
    }
}
