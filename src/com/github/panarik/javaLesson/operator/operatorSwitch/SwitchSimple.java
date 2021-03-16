package com.github.panarik.javaLesson.operator.operatorSwitch;

public class SwitchSimple {

    public static void main(String[] args) {

        String recipient = "1";

        switch (recipient) {
            case "Petya":
                System.out.println("Box #1");
                break;
            case "Vova":
                System.out.println("Box #2");
                break;
            case "Ivan":
                System.out.println("Box #3");
                break;
            default:
                System.out.println("Nothing");
        }

    }
}
