package com.github.panarik.javaLesson.lessons.patterns.structural.proxy;

/**
 * Defines concrete ATM.
 * This ATM has special methods for users from {@link GetATMData} interface.
 */
public class ATM implements GetATMData {

    private final String userInformation = "Some information for users.";
    private final String serviceInformation = "Some information for serviceman's.";
    private int cashInMachine = 2000;

    /**
     * User method for getting current ATM data for users.
     *
     * @return Current ATM data.
     */
    public String getATMData() {
        return userInformation;
    }

    /**
     * Serviceman's method for setting ATM money.
     *
     * @param sum Sum for setting.
     */
    public void setCashData(int sum) {
        this.cashInMachine += sum;
    }

}
