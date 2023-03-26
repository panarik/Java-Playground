package com.github.panarik.javaLesson.lessons.architecture.patterns.behavioral.command.deviceReceiver;

/**
 * Concrete radio device.
 */
public class Radio implements Device {

    private int volume = 1;

    public void on() {
        System.out.println("Turn radio ON.");
    }

    public void off() {
        System.out.println("Turn radio OFF.");
    }

    public void volumeUp() {
        volume++;
        System.out.println("Radio volume is " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("Radio volume is " + volume);
    }

}
