package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.state;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.state.states.ATM;

/**
 * Defines operating ATM.
 * Each action turns ATM to different states.
 */
public class StatePatternExample {

    public static void main(String[] args) {

        ATM atm = new ATM();

        atm.insertCard();
        atm.insertPin(1234);
        atm.requestCash(500);

        atm.setCashInMachine(1000);

    }

}
