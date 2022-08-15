package com.github.panarik.javaLesson.lessons.patterns.behavioral.state.states;

/**
 * Defines concrete ATM.
 */
public class ATM {

    // Different states.
    private final ATMState hasCard;
    private final ATMState noCard;
    private final ATMState hasCorrectPin;
    private final ATMState outOfMoney;
    int cashInMachine = 2000;
    boolean correctPinEntered = false;
    private ATMState state; // Current state based on different conditions.

    public ATM() {

        // Initialize all possible states.
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        outOfMoney = new NoCash(this);

        //Initialize default state.
        state = noCard;

        // Define out of money state.
        if (cashInMachine <= 0) state = outOfMoney;
    }

    /**
     * User are inserting bank card.
     */
    public void insertCard() {
        state = hasCard;
    }

    /**
     * User are typing pin code.
     *
     * @param pinCode pin code.
     */
    public void insertPin(int pinCode) {
        state.insertPin(pinCode);
    }

    /**
     * User are requesting some cash.
     *
     * @param cashRequested Amount of cash.
     */
    public void requestCash(int cashRequested) {
        state.requestCash(cashRequested);
    }

    /**
     * User are ejecting a bank card.
     */
    public void ejectCard() {
        state = noCard;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine += cashInMachine;
    }


    ATMState getHasCardState() {
        return hasCard;
    }

    ATMState getNoCardState() {
        return noCard;
    }

    ATMState getHasPin() {
        return hasCorrectPin;
    }

    ATMState getNoCashState() {
        return outOfMoney;
    }

    /**
     * Defines changing current ATM state.
     * Service method using only by states.
     *
     * @return New {@link ATMState} for current ATM.
     */
    void setState(ATMState state) {
        this.state = state;
    }

}
