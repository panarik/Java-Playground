package com.github.panarik.javaLesson.lessons.patterns.behavioral.chain.calculationTypes;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.chain.data.Numbers;

public class MultipleNumbers implements Chain {

    Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    /**
     * Execute '*' calculation if this type is had in {@link Numbers} requirements.
     *
     * @param request Request with {@link Numbers}.
     */
    public void execute(Numbers request) {
        if (request.getCalculationType().equals("multiple")) {
            System.out.println("Start executing: " + request.getNumber1() + " * " + request.getNumber2());
            int result = request.getNumber1() * request.getNumber2();
            System.out.println("Result: " + result);
        } else nextChain.execute(request);
    }

}
