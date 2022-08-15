package com.github.panarik.javaLesson.lessons.patterns.structural.facade.behindOperations;

/**
 * This class represents some behind operations with password.
 */
public class PasswordCheck {

    private final int password = 1234;

    public boolean checkPassword(int password) {
        return this.password == password;
    }

}
