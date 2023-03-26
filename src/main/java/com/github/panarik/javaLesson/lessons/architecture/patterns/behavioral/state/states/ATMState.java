package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.state.states;

/**
 * Defines ATM states.
 */
public interface ATMState {

    void insertCard();

    void ejectCard();

    void insertPin(int pinCode);

    void requestCash(int cashRequested);

}
