package com.github.panarik.javaLesson.lessons.patterns.behavioral.state.states;

public class NoCard implements ATMState {

    // Hold all data from concrete ATM.
    // Pass this ATM throw all states.
    ATM atm;

    public NoCard(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card has inserted.");
        atm.setState(atm.getHasCardState());
    }

    public void ejectCard() {
        System.out.println("Already no card.");
    }

    public void insertPin(int pinCode) {
        System.out.println("Please insert card first.");
    }

    public void requestCash(int cashRequested) {
        System.out.println("Please insert card first.");
    }

}
