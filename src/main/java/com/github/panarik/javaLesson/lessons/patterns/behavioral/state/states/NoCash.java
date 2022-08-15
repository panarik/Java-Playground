package com.github.panarik.javaLesson.lessons.patterns.behavioral.state.states;

public class NoCash implements ATMState {

    ATM atm;

    public NoCash(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    public void ejectCard() {
        System.out.println("Card has ejected.");
        atm.setState(atm.getNoCardState());
    }

    public void insertPin(int pinCode) {
        System.out.println("Pin already entered.");
    }

    public void requestCash(int cashRequested) {
        System.out.println("Don't have any cash.");
    }
}
