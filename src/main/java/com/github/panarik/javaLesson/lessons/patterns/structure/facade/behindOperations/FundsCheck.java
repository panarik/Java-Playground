package com.github.panarik.javaLesson.lessons.patterns.structure.facade.behindOperations;

/**
 * This class represents some behind operations with account funds.
 */
public class FundsCheck {

    private int accountAmount = 10000; // Amount of money for this account.

    /**
     * Check possible operation for getting money from account.
     * * Account must have more money than getting parameter.
     *
     * @param gettingSum Sum getting from account.
     * @return Operation possibility.
     */
    public boolean checkAmount(int gettingSum) {
        if (accountAmount < gettingSum) {
            System.out.println("You don't have enough money.");
            System.out.println("Current balance: " + accountAmount);
            return false;
        } else return true;
    }

    public int getAmountInfo() {
        return accountAmount;
    }

    /**
     * Withdraw cash from account.
     * Account amount will be decreased.
     *
     * @param sum Withdraws sum.
     */
    public void decreaseAmount(int sum) {
        this.accountAmount -= sum;
        System.out.println("Withdrawal complete. Current balance is " + accountAmount);
    }

    /**
     * Deposit money to account.
     * Account amount will be increased.
     *
     * @param sum Deposit sum.
     */
    public void makeDeposit(int sum) {
        this.accountAmount += sum;
        System.out.println("Deposit account complete. Current balance is " + accountAmount);
    }

}
