package com.github.panarik.javaLesson.lessons.lang.operator.operatorSwitch;

public class SwitchSimple {

    public static void main(String[] args) {

        String recipient = "Petya";

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

        switch (recipient) {
            case "Petya" -> System.out.println("Box #1");
            case "Vova" -> System.out.println("Box #2");
            case "Ivan" -> System.out.println("Box #3");
            default -> System.out.println("Nothing");
        }

    }

}
