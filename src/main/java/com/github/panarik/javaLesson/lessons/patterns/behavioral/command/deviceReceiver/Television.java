package com.github.panarik.javaLesson.lessons.patterns.behavioral.command.deviceReceiver;

/**
 * Concrete TV device.
 */
public class Television implements Device {

    private int volume = 0;

    public void on() {
        System.out.println("TV is ON.");
    }

    public void off() {
        System.out.println("TV is OFF");
    }

    public void volumeUp() {
        volume++;
        System.out.println("TV volume is " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("TV volume is " + volume);
    }

}
