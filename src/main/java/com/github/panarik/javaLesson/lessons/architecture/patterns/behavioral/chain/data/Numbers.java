package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.chain.data;

public class Numbers {

    private final String calculationType; // Type of calculation needed.
    private final int number1;
    private final int number2;

    public Numbers(String calculationType, int number1, int number2) {
        this.calculationType = calculationType;
        this.number1 = number1;
        this.number2 = number2;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

}
