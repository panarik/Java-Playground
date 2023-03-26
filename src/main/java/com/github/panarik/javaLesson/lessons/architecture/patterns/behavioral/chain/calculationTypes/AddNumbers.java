package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain.calculationTypes;

import com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain.data.Numbers;

/**
 * Represents one of operation on this {@link Chain} operations.
 */
public class AddNumbers implements Chain {

    private Chain nextChain; // Next chain of operations in scenario chain.

    /**
     * Set up the next type of calculations.
     *
     * @param nextChain new {@link Chain}
     */
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    /**
     * Execute '+' calculation if this type is had in {@link Numbers} requirements.
     *
     * @param request Request with {@link Numbers}.
     */
    public void execute(Numbers request) {
        if (request.getCalculationType().equals("add")) {
            System.out.println("Start executing: " + request.getNumber1() + " + " + request.getNumber2());
            int result = request.getNumber1() + request.getNumber2();
            System.out.println("Result: " + result);
        } else nextChain.execute(request);
    }

}
