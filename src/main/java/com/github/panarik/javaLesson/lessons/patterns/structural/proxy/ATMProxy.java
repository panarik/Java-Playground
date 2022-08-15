package com.github.panarik.javaLesson.lessons.patterns.structural.proxy;

/**
 * Proxy service having real ATM.
 * This service is needed for safety using real ATM.
 */
public class ATMProxy implements GetATMData {

    private ATM realATM = new ATM(); // Represents real ATM connection.
    private boolean realATMBusy = true; // Represents ATM status as busy.


    /**
     * Represents getting data from real ATM.
     * If real ATM is busy, user can get data from prepared cashed ATM.
     *
     * @return ATM data.
     */
    public String getATMData() {
        if (realATMBusy) {
            ATM cashedATM = new ATM(); // Some prepared cashed ATM example using while real ATM is busy.
            return cashedATM.getATMData();
        } else return realATM.getATMData();
    }

}
