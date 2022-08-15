package com.github.panarik.javaLesson.lessons.patterns.behavioral.state.states;

public class HasCard implements ATMState {

    // Hold all data from concrete ATM.
    // Pass this ATM throw all states.
    ATM atm;

    public HasCard(ATM atm) {
        this.atm = atm;
        System.out.println("Card has inserted.");
    }

    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    public void ejectCard() {
        System.out.println("Card has ejected.");
        atm.setState(atm.getNoCardState()); // Set ATM state to noCard state.
    }

    public void insertPin(int pinCode) {
        if (pinCode == 1234) {
            System.out.println("Pin code has entered correctly.");
            atm.correctPinEntered = true;
            atm.setState(atm.getHasPin());
        } else System.out.println("Wrong pin code. Try again.");
    }

    public void requestCash(int cashRequested) {
        System.out.println("Insert PIN first.");
    }

}
