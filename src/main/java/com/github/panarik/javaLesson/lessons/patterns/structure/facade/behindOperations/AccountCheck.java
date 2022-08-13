package com.github.panarik.javaLesson.lessons.patterns.structure.facade.behindOperations;

/**
 * This class represents some behind operations with account.
 */
public class AccountCheck {

    private final int accountNumber = 12345678;

    public boolean checkAccount(int accountNumber) {
        return this.accountNumber == accountNumber;
    }

}
