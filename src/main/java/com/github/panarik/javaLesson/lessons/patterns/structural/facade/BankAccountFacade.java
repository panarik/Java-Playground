package com.github.panarik.javaLesson.lessons.patterns.structural.facade;

import com.github.panarik.javaLesson.lessons.patterns.structural.facade.behindOperations.AccountCheck;
import com.github.panarik.javaLesson.lessons.patterns.structural.facade.behindOperations.FundsCheck;
import com.github.panarik.javaLesson.lessons.patterns.structural.facade.behindOperations.PasswordCheck;

public class BankAccountFacade {

    private final int accountNumber;
    private final int securityCode;
    private final AccountCheck accountChecker;
    private final PasswordCheck passwordChecker;
    private final FundsCheck fundsChecker;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        accountChecker = new AccountCheck();
        passwordChecker = new PasswordCheck();
        fundsChecker = new FundsCheck();
    }

    /**
     * Withdraw cash from bank account.
     *
     * @param sum Amount of cash.
     */
    public void withdrawCash(int sum) {
        if (accountChecker.checkAccount(accountNumber) &&
                passwordChecker.checkPassword(securityCode) &&
                fundsChecker.checkAmount(sum)) {

            fundsChecker.decreaseAmount(sum);
            System.out.println("Transaction complete.\n");
        } else System.out.println("Transaction failed.\n");
    }

    /**
     * Deposit cash to bank account.
     *
     * @param sum Amount of cash.
     */
    public void depositCash(int sum) {
        if (accountChecker.checkAccount(accountNumber) &&
                passwordChecker.checkPassword(securityCode)) {

            fundsChecker.makeDeposit(sum);
            System.out.println("Transaction complete.\n");
        } else System.out.println("Transaction failed.\n");
    }

}
