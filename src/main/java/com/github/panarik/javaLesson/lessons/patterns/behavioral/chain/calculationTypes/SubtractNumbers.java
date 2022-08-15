package com.github.panarik.javaLesson.lessons.patterns.behavioral.chain.calculationTypes;

import com.github.panarik.javaLesson.lessons.patterns.behavioral.chain.data.Numbers;

public class SubtractNumbers implements Chain {

    Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    public void execute(Numbers request) {
        if (request.getCalculationType().equals("subtract")) {
            System.out.println("Start executing: " + request.getNumber1() + " / " + request.getNumber2());
            int result = request.getNumber1() / request.getNumber2();
            System.out.println("Result: " + result);
        } else System.out.println("Unsupported type of calculations. Try 'add' or 'multiple' or 'subtract'.");
    }
}
